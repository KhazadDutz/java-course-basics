
public class Types {

	public static void main(String[] args) {
		byte age = 29; //-128 a 127
		short brazilDistanceNorthSouth = 4350; //-32768 a 32767
		int moonDistanceEarth = 384400; //-2147483648 a 2147483647
		long earthAge = 4540000000L; //-9223372036854770000 a 9223372036854770000
		double height = 1.66;
		char initialNameLetter = 'M';
		boolean isMasterAtLeague = false;
		String gender = "Masculino";
		
		System.out.println(age);
		System.out.println(height);
		System.out.println(gender);
		System.out.println(brazilDistanceNorthSouth);
		System.out.println(moonDistanceEarth);
		System.out.println(earthAge);
		System.out.println(initialNameLetter);
		System.out.println(isMasterAtLeague);
	}

}
