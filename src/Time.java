public class Time {
	private int hora;
	private int minuto;
	private int segundo;
	
	public Time(int hora, int minuto, int segundo) {
		super();
		this.hora = hora;
		this.minuto = minuto;
		this.segundo = segundo;
	}

	public int getHora() {
		return hora;
	}

	public void setHora(int hora) {
		this.hora = hora;
	}

	public int getMinuto() {
		return minuto;
	}

	public void setMinuto(int minuto) {
		this.minuto = minuto;
	}

	public int getSegundo() {
		return segundo;
	}

	public void setSegundo(int segundo) {
		this.segundo = segundo;
	}
	
	public void setTime (int h, int m, int s) {
		this.hora = h;
		this.minuto = m;
		this.segundo = s;
	}
	
	public String exibirHoraUniversal() {
		return hora+":"+minuto+":"+segundo;
	}
	
	public String exibirHoraPadrao() {
		if (hora==12){
			return hora+":"+minuto+":"+segundo+" PM";
		}
		else if (hora==0) {
			return (hora+12)+":"+minuto+":"+segundo+" AM";
		}
		else if (hora>=1 && hora<=11) {
			return hora+":"+minuto+":"+segundo+" AM";
		}
		else {		
			return (hora-12)+":"+minuto+":"+segundo+" PM";
		}
	}
	
	private String formataNumero(int num) {
		if(num<10) {
			return "0"+num;
		}
		else {
			return num+"";
		}
	}
	
	private String fmtNum(int num) {
		return (num<10) ? "0"+num : ""+num;
	}
	
}
