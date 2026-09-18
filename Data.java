class Data{
    private int ano;
    private int mes;                                                                                                                                                                                                                           
    private int dia;
  
    //construtor
    public Data(int ano, int mes, int dia){
        this.ano = ano;
        this.mes = mes;
        this.dia = dia;
    }
  
    //setters and getters
    public void setAno(int ano){this.ano = ano;}
    public void setMes(int mes){this.mes = mes;}     
    public void setDia(int dia){this.dia = dia;}
  
    public int getAno(){return ano;}
    public int getMes(){return mes;}
    public int getDia(){return dia;}
  
    public static Data parseData(String s){
        String[] campos = s.split("-");
        int ano = Integer.parseInt(campos[0]);
        int mes = Integer.parseInt(campos[1]);
        int dia = Integer.parseInt(campos[2]);
        return new Data(ano,mes,dia);
    }
    public String format(){return String.format("%02d/%02d/%04d", dia,mes,ano);}
}
