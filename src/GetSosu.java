public class GetSosu {
	
	static int NextSosu(int sosu) {
		int nextsosu = sosu + 1;
		boolean hakken;
		if (sosu == 1) {
			nextsosu = 2;
		} else if (sosu == 2) {
			nextsosu = 3;
		} else {
			while (true) {
				hakken = true;
				for (int i = 2; i <= sosu / 2 + 1; ++i) {
					if (nextsosu % i == 0) {
						hakken = false;
						break;
					}
				}
				if (hakken) {
					break;
				} else {
					++nextsosu;
				}
			}
		}
		return(nextsosu);
	}
	
	public static void main(String[] args) {
		int sosu = 1;
		for (int i = 0; i < 9999; ++i) {
			sosu = NextSosu(sosu);
		}
		System.out.println(NextSosu(sosu));
	}
}

