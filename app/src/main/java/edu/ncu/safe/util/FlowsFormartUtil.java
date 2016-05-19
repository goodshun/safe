package edu.ncu.safe.util;

public class FlowsFormartUtil {
	public static String toFlowsFormart(long flowsByte){
		float flowsK = ((float)flowsByte)/1024;
		if(flowsK<=1){
			return flowsByte+"Byte";
		}
		float flowsM = flowsK/1024;
		if(flowsM<=1){
			return String.format("%.2fKB", flowsK);
		}
		
		float flowsG = flowsM/1024;
		if(flowsG<=1){
			return  String.format("%.2fMB", flowsM);
		}
		
		float flowsT = flowsG/1024;
		if(flowsT<=1){
			return  String.format("%.2fGB", flowsG);
		}else{
			return  String.format("%.2fTB", flowsT);
		}
	}
	
	public static String toMBFormat(long data){
		float flowsM = ((float) data)/(1024*1024);
		return  String.format("%.2f", flowsM);
	}
	
	public static String toFlowsSpeedFormart(long flowsByte){
		float flowsK = ((float)flowsByte)/1024;
		if(flowsK<=1){
			return to11LengthString(flowsByte+"B/s");
		}
		float flowsM = flowsK/1024;
		if(flowsM<=1){
			return to11LengthString(String.format("%.2fK/s", flowsK));
		}
		
		float flowsG = flowsM/1024;
		if(flowsG<=1){
			return to11LengthString(String.format("%.2fM/s", flowsM));
		}
		
		float flowsT = flowsG/1024;
		if(flowsT<=1){
			return to11LengthString(String.format("%.2fG/s", flowsG));
		}else{
			return to11LengthString(String.format("%.2fT/s", flowsT));
		}
	}
	
	private static String to11LengthString(String res){
		return res;
	}
}