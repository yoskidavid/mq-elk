package test;

public class Test01 {

	public static void main(String[] args) {
		
		//int[] arr = {4,1,8,7,1,1,8,2,1,8,15,4,6,2,7,1,1,1,8,8,1,3,3,1,36,117,1,11,15,6,14,2,8,12,7,1,6,4,20,2,8,14,6,12,12,2,18,2,30,2,3,1,19,2,15,3,1,11,1,19,1,6,16,3,20,2,2,8,1,11,22,10,1,17,4,1,19,2,3,6,44,3,30,14,14,1,19,1,19,2,1,19,2,1,19,2,1,19,2,1,19,2,1,19,50,2,30,17,1,4,1,8,6,80,8,5,1,15,4,1,36,85,1,1,11,15,6,14,8,12,3,6,8,4,6,2,30,40,4,2,1,12,38,4,20,1,19,40,40,1,1,1,3,2,3,4,46,3,30,2,30,14,14,1,19,1,19,1,19,2,20,1,19,2,20,1,19,2,20,1,19,2,20,1,19,2,20,1,19,50,1,19,14,14,1,1,19,2}; 
		int[] arr = {15, 6, 14, 2, 8};
		String[] campos = {"codEmpresa","codOperacion","fechaHora","canal","numOperacion"};
		
		String cad = "<Data>CP0133CP01BM1000                         000000                              00                                                                                       CP011APBMPRO 0U17666SS112911432 0                                                                                                                                                                                                                               00000520200COMERCIO       10102020210910165027BM11291143            TERM    1110230001       193202178809906                                                                        0100000000000000000000007891996901000 00000000000000000000                    0000000000000000000000000000                                                                                                                         0004 00000000000000000000                                                                                                                  000000000000000000  000000000000000000                                                                                                                                                                                                                                                                          000000000000000000 000000000000000000                                                                                                                                                                                                                                                                           000000000000000000 000000000000000000                                                                                                                                                                                                                                                                           000000000000000000 000000000000000000                                                                                                                                                                                                                                                                           000000000000000000 000000000000000000                                                                                                                                                                                                                                                                           000000000000000000 000000000000000000                                                                                                                                                                                                                                                                           000000000000000000 000000000000000000                                                                                                                                                                                                                                                                           000000000000000000 000000000000000000                                                                                                                                                                                                                                                                           000000000000000000 000000000000000000                                                                                                                                                                                                                                                                           000000000000000000 000000000000000000                                                                                                                                                                                                                                                                           000000000000000000 000000000000000000                                                                                                                                                                                                                                                                           000000000000000000 000000000000000000                                                                                                                                                                                                                  000000000000000000 00                                                                                                                  000000000000000000 000000000000000000                                                                                                                                                                                                                                                                           000000000000000000 000000000000000000                                                                                                                                                                                                                                                                           000000000000000000 000000000000000000                                                                                                                                                                                                                                                                           000000000000000000 000000000000000000                                                                                                                                                                                                                                                                           000000000000000000 000000000000000000                                                                                                                                                                                                                                                                           000000000000000000 000000000000000000                                                                                                                                                                                                                                                                           000000000000000000 000000000000000000                                                                                                                                                                                                                                                                           000000000000000000 000000000000000000                                                                                                                                                                                                                                                                           000000000000000000 000000000000000000                                                                                                                                                                                                                                                                           000000000000000000 000000000000000000                                                                                                                                                                                                                                                                           000000000000000000 000000000000000000                                                                                                                                                                                                                                                                           000000000000000000 000000000000000000                                                                                                                                                                                                                  000000000000000000 00                                                                                                                  000000000000000000 000000000000000000                                                                                                                                                                                                                                                                           000000000000000000 000000000000000000                                                                                                                                                                                                                                                                           000000000000000000 000000000000000000                                                                                                                                                                                                                                                                           000000000000000000 000000000000000000                                                                                                                                                                                                                                                                           000000000000000000 000000000000000000                                                                                                                                                                                                                                                                           000000000000000000 000000000000000000                                                                                                                                                                                                                                                                           000000000000000000 000000000000000000                                                                                                                                                                                                                                                                           000000000000000000 000000000000000000                                                                                                                                                                                                                                                                           000000000000000000 000000000000000000                                                                                                                                                                                                                                                                           000000000000000000 000000000000000000                                                                                                                                                                                                                                                                           000000000000000000 000000000000000000                                                                                                                                                                                                                                                                           000000000000000000 000000000000000000                                                                                                                                                                                                                  000000000000000000 00                                                                                                                  000000000000000000 000000000000000000                                                                                                                                                                                                                                                                           000000000000000000 000000000000000000                                                                                                                                                                                                                                                                           000000000000000000 000000000000000000                                                                                                                                                                                                                                                                           000000000000000000 000000000000000000                                                                                                                                                                                                                                                                           000000000000000000 000000000000000000                                                                                                                                                                                                                                                                           000000000000000000 000000000000000000                                                                                                                                                                                                                                                                           000000000000000000 000000000000000000                                                                                                                                                                                                                                                                           000000000000000000 000000000000000000                                                                                                                                                                                                                                                                           000000000000000000 000000000000000000                                                                                                                                                                                                                                                                           000000000000000000 000000000000000000                                                                                                                                                                                                                                                                           000000000000000000 000000000000000000                                                                                                                                                                                                                                                                           000000000000000000 000000000000000000                                                                                                                                                                                                                  000000000000000000 00                                                                                                                  000000000000000000 000000000000000000                                                                                                                                                                                                                                                                           000000000000000000 000000000000000000                                                                                                                                                                                                                                                                           000000000000000000 000000000000000000                                                                                                                                                                                                                                                                           000000000000000000 000000000000000000                                                                                                                                                                                                                                                                           000000000000000000 000000000000000000                                                                                                                                                                                                                                                                           000000000000000000 000000000000000000                                                                                                                                                                                                                                                                           000000000000000000 000000000000000000                                                                                                                                                                                                                                                                           000000000000000000 000000000000000000                                                                                                                                                                                                                                                                           000000000000000000 000000000000000000                                                                                                                                                                                                                                                                           000000000000000000 000000000000000000                                                                                                                                                                                                                                                                           000000000000000000 000000000000000000                                                                                                                                                                                                                                                                           000000000000000000 000000000000000000                                                                                                                                                                                                              </Data>";		
		int ini = cad.lastIndexOf("<Data>");
		int fin = cad.lastIndexOf("</Data>");
		cad = cad.substring(ini+6, fin);
		
		String tipo = cad.substring(0, 6);
		cad = cad.substring(6, cad.length()-6);
		
		
		
		//System.out.println("--------"+cad.indexOf("CP011APB"));
		//160
		//256
		//11
		
		//System.out.println("--------"+cad.substring(427,427+));
		
		int totCad=427;
		for(int i=0; i<arr.length; i++) {
		    int tmp = totCad;
		    
			totCad = totCad+arr[i];
		    String ncad = cad.substring(tmp,totCad);
			System.out.println(campos[i]+"="+ncad);
		}
		
		
		
	}

}
