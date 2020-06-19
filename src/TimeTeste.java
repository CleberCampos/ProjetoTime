
public class TimeTeste {
	
	public static void main(String[] args) {
		
		Time t = new Time(15,30,45);
		
		System.out.println(t.exibirHoraPadrao());
		System.out.println(t.exibirHoraUniversal());
		
		t.setTime(8,15,40);
		
		System.out.println(t.exibirHoraPadrao());
		System.out.println(t.exibirHoraUniversal());
		
		t.setTime(0,15,40);
		
		System.out.println(t.exibirHoraPadrao());
		System.out.println(t.exibirHoraUniversal());
			
		t.setTime(12,15,40);
		
		System.out.println(t.exibirHoraPadrao());
		System.out.println(t.exibirHoraUniversal());
	}
}
