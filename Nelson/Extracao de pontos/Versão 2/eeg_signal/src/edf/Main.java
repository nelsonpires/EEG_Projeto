package edf;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

public class Main {
	
	private static double[][] ch_signals_points;//points of the 30 channels
	private static double[][] used_ch_signals;//points of the 18 channels used in the program
	private static String[] channel_name;//names of the 30 channels
	private static String[] used_channels;//names of the 18 channels used in the program
	
	public double[][] getCh_signals_points(){
		return ch_signals_points;
	}
	
	public double[][] getUsed_ch_signals(){
		return used_ch_signals;
	}
	
	public String[] getChannel_name(){
		return channel_name;
	}
	
	public String[] getUsed_channels(){
		return used_channels;
	}
	
	
	//find the raw channels index
	public static int find_channel_index(String[] cn, String n){
		int index = 0;
		
		for(int i=0;i<cn.length;i++){
			if(cn[i].equals(n)){
				index = i;
				break;
			}
		}
		
		return index;
	}
	
	//find the index of the channels used in the program
	public static int find_used_ch_index(String[] ucn, String n){
		int index = 0;
		
		for(int i=0;i<ucn.length;i++){
			if(ucn[i].equals(n)){
				index = i;
				break;
			}
		}
		
		return index;
	}
	
	private static void calc_used_ch_signals(){
		
		
		for(int i=0; i<used_channels.length; i++){
			String[] parts = used_channels[0].split("-");//split the used channel in the two channels that
														//need to be subtracted
			//find the index of the channels that need to be subtracted and subtract them
			for(int j=0; j<ch_signals_points[i].length;j++){
				used_ch_signals[i][j] = ch_signals_points[find_channel_index(channel_name,parts[0])][j]
						- ch_signals_points[find_channel_index(channel_name,parts[1])][j];
				
				//invert signal(necessary to be compatible with the desired signal)
				used_ch_signals[i][j] = used_ch_signals[i][j]*(-1);
			}
		}
		
	}
	
	//set the used channels names
	private static void set_used_channels_name(){
		used_channels[0] = "Fp1-F3";
		used_channels[1] = "F3-C3";
		used_channels[2] = "C3-P3";
		used_channels[3] = "P3-O1";
		used_channels[4] = "Fp1-F7";
		used_channels[5] = "F7-T3";
		used_channels[6] = "T3-T5";
		used_channels[7] = "T5-O1";
		used_channels[8] = "Fp2-F4";
		used_channels[9] = "F4-C4";
		used_channels[10] = "C4-P4";
		used_channels[11] = "P4-O2";
		used_channels[12] = "Fp2-F8";
		used_channels[13] = "F8-T4";
		used_channels[14] = "T4-T6";
		used_channels[15] = "T6-O2";
		used_channels[16] = "FZ-CZ";
		used_channels[17] = "CZ-PZ";
	}
	
	private static void only_channels_name(String[] cn){

		//keeps only the name of the channel
		for(int i=0; i<cn.length;i++){
			cn[i] = cn[i].replace("EEG", "");
			cn[i] = cn[i].replace("-Ref", "");
			cn[i] = cn[i].replaceAll("\\s","");//erase all blank spaces
		}
		
	}
	
		
	
	public static void main(String[] args) throws FileNotFoundException, EDFParserException {

		String pathToEdfFile = "C:\\Users\\Nelson\\Desktop\\EDF_Teste\\BERNARDO_JANZ_ELIAS.EDF";
		InputStream is = new BufferedInputStream(new FileInputStream(new File(pathToEdfFile)));
		//gets all the informations of the EDF file. We use only the signals points and channels names
		EDFParserResult result = EDFParser.parseEDF(is);
		
		//signals_points[i][j] : i = index of channel; j contains the signal points of the channel
		ch_signals_points = result.getSignal().getValuesInUnits();
		//contains the names of the channels. The name in the index i is the same index for singals_points[i][j]
		channel_name = result.getHeader().getChannelLabels();
		only_channels_name(channel_name);
	   //contains the names of the channels. The name in the index i is the same index for used_ch_signals[i][j]
		used_channels = new String[18];
		set_used_channels_name();
		//used_ch_signals[i][j] : i = index of channel; j contains the signal points of the channel
		used_ch_signals = new double[used_channels.length][ch_signals_points[0].length];
		calc_used_ch_signals();
		//System.out.print(used_ch_signals[0][0]);
	}
	
}
