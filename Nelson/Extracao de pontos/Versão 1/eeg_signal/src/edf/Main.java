package edf;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

public class Main {
	
	private static double[][] ch_signals_points;
	private static String[] channel_name;
	
	public double[][] getCh_signals_points(){
		return ch_signals_points;
	}
	
	public String[] getChannel_name(){
		return channel_name;
	}
	
	public static int find_channel_index(String[] cn, String n){
		int index = 0;
		
		for(int i=0;i<cn.length;i++){
			if(cn[i].equals(n)){
				index = i;
				break;
			}
		}
		//System.out.println(index);
		return index;
	}
	
	private static void only_channels_name(String[] cn){

		//keeps only the name of the channel
		for(int i=0; i<cn.length;i++){
			cn[i] = cn[i].replace("EEG", "");
			cn[i] = cn[i].replace("-Ref", "");
			cn[i] = cn[i].replaceAll("\\s","");
		}
		
	}
	
		
	
	public static void main(String[] args) throws FileNotFoundException, EDFParserException {
		// TODO Auto-generated method stub
		String pathToEdfFile = "C:\\Users\\Nelson\\Desktop\\EDF_Teste\\BERNARDO_JANZ_ELIAS.EDF";
		InputStream is = new BufferedInputStream(new FileInputStream(new File(pathToEdfFile)));
		EDFParserResult result = EDFParser.parseEDF(is);
		
		//signals_points[i][j] : i = index of channel; j contains the signal points of the channel
		ch_signals_points = result.getSignal().getValuesInUnits();
		//contains the names of the channels. The name in the index i is the same index for singals_points[i][j]
		channel_name = result.getHeader().getChannelLabels();
		only_channels_name(channel_name);
		//System.out.print(channel_name[0]);
	}
	
}
