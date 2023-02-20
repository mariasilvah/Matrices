import java.util.Arrays;
import java.io.*;

public class Matriz {
	
	public static int[][]multi(int [][]mata, int [][]matb) {
		int[][]m = new int[mata.length][matb[0].length];
		if(mata[0].length==matb.length);{
			for(int i=0; i<mata.length; i++) {
				for(int j=0; j<matb[0].length; j++) {
					for (int g=0; g<matb[0].length; g++) {
						m[i][j]+=mata[i][g] * matb[g][j];
					}
				}
			}
		}
	return m;	
	}
	//2
	public static int[][]tran(int[][]matri){
		int[][]matT = new int[matri[0].length][matri.length];
		for(int x=0; x<matri.length; x++) {
			for(int y=0; y<matri[x].length; y++) {
				matT[y][x]=matri[x][y];
			}
		}
	return matT;	
	}
	
	//3
	public static void suDip(int [][]matro, int n) {
		int dp=0;
		for(int r=0;r<n; r++) {
			for(int c=0; c<n; c++) {
				if(r==1)
					dp+=matro[r][c];
			}
		}
		 System.out.println("La suma de la diagonal principal:"+ dp);
	}
	//4
	public static void maxNum(int[]maxmat) {
		int matmax=maxmat[0];
		for (int u = 0; u < maxmat.length; u++) {
        	// El número de travesaños actuales es más de máx. Y el número se asigna a MAX.
            if (maxmat[u] > matmax) {
                matmax = maxmat[u];
            }
		}
        System.out.println("El valor máximo de la matriz es:" +matmax);
	}
	//5
	public static int[][] SuMat (int[][] matv,int[][] matw, int size) {
		int lasum[][]=new int[size][size];
		for(int v=0; v<matv.length; v++) {
			for(int w=0; w<matw.length; w++) {
				lasum[v][w]=matv[v][w]+matw[v][w];
				//System.out.println(lasum[v][w]+"");
			}
		//System.out.println(" ");
		}
	return lasum;
	}
	//6
	public static int[][]Mules(int[][]mate, int e){
		int [][]Me = new int[mate.length][mate[0].length];
		for(int q=0; q<Me.length; q++) {
			for(int z=0; z<Me[q].length;z++) {
				Me[q][z]=e*mate[q][z];
			}
		}
	return Me;
	}

		
	public static void main(String[] args) {
	//1	
		int[][] mata = { { 1, 2 }, { 4, 0 } };
	    int[][] matb = { { 3, 1 }, { 2, 4 }};
	    int[][] m = multi(mata, matb);
	    System.out.println("La multiplicacion de las dos matrices es:"+Arrays.deepToString(m));
	    
	    System.out.println("\n\n");
	    
	 //2
	    int[][]matri = {{5, 6, 9},{7, 1 , 3}};
	    int [][]matT=tran(matri);
	    System.out.println("La transpuesta es :"+Arrays.deepToString(matT));
	    
	    System.out.println("\n\n");

	 //3
	    int[][]s={ { 8, 2, 13, 4 },
                   { 9, 16, 17, 8 },
                   { 1, 22, 3, 14 },
                   { 15, 6, 17, 8 } };
	    suDip(s, 4);
	    
	    System.out.println("\n\n");

	   
     //4
	    int[] maxmat = {5, 8, 1, 5, 9, 7};
        maxNum(maxmat);
        
	    System.out.println("\n\n");

        
     //5
        int[][] matv = { { 1, 2 }, { 4, 0 } };
	    int[][] matw = { { 3, 1 }, { 2, 4 }};
	    int[][]lasum=SuMat(matv,matw,2);
	    System.out.println("La suma de las dos matrices es: "+Arrays.deepToString(lasum));
	    
	    System.out.println("\n\n");

	 
	  //6
	    int[][]mate={{1,0,2},{-1,3,1}};
	    int [][]Me=Mules(mate,2);
	    System.out.println("La multiplicación de la matriz por el escalar es: "+Arrays.deepToString(Me));
	}	
}
