package varshi;

public class projrc {

	public static void main(String[] args) {
		 int n=10;
			for(int i=1;i<=n;i++) {
				for(int j=1;j<i;j++) {
					System.out.print(" ");
				}
				for(int k=n-i;k>=0;k--) {
						if((k==n-i || k==0)) {
							System.out.print(" *");
						}else {
							System.out.print("  ");
						}
				}
				System.out.println();
			}
			
			System.out.println();
			
			for(int i=1;i<=n;i++) {
				for(int j=n-i;j>=0;j--) {
					System.out.print(" ");
				}
				for(int k=0;k<2*i-1;k++) {
					if(i==1 || i==n/2+1) {
						System.out.print("*");
					}else {
						if((k==0 || k==2*i-2)) {
							System.out.print("*");
						}else {
							System.out.print(" ");
						}
					}
				}
				System.out.println();
			}
			
			System.out.println();
	
			for(int i=1;i<=n;i++) {
				if(i<=n/2+1) {
					for(int j=0;j<n;j++) {
						if(i>1 && i<n/2+1)
							if(j>0 && j<n-1) {
								System.out.print("  ");
							}
							else {
								System.out.print(" *");
							}
						else {
							System.out.print(" *");
						}	
					}System.out.println();	
				}else {
					for(int j=1;j<=n;j++) {
						if(j==i || j==1) {
							System.out.print(" *");
						}else {
							System.out.print("  ");
						}
					}System.out.println();
				}
				
			}
			
			System.out.println();
			
			for(int i=1;i<=n;i++) {
				if(i<=n/2+1) {
					if(i>1 && i<n/2+1) {
						System.out.println(" *");
					}else {
						for(int j=1;j<=n;j++) {
							System.out.print(" *");
						}System.out.println();
					}
				}else {
					if(i>n/2+1 && i<n) {
						for(int j=1;j<n;j++) {
							System.out.print("  ");
						}System.out.println(" *");
					}else {
						for(int j=1;j<=n;j++) {
							System.out.print(" *");
						}System.out.println();
					}
				}
				
			}
			
			System.out.println();
			
			for(int i=0;i<n;i++) {
				if(i==n/2) {
					for(int j=0;j<n;j++) {
						System.out.print(" *");
					}System.out.println();
				}else {
					for(int j=0;j<n;j++) {
						if(j==0 || j==n-1) {
							System.out.print(" *");
						}
						else {
							System.out.print("  ");
						}
					}System.out.println();
				}
				
			}
			
			System.out.println();
			
			for(int i=0;i<n;i++) {
				if(i==0 || i==n-1) {
					for(int j=0;j<n;j++) {
						System.out.print(" *");
					}System.out.println();
				}else {
					for(int j=0;j<n;j++) {
						if(j==n/2) {
							System.out.print(" *");
						}else {
						System.out.print("  ");
						}
					}System.out.println();
				}
				
			}
	}

}
