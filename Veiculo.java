class Veiculo{
    private int id;
    private String marca;
    private String modelo;
    private int ano;
    private String categoria;
    private String[] combustivel;
    private int cilindros;
    private double cilindrada;
    private String transmissao;
    private String tracao;
    private double consumoCidade;
    private double consumoEstrada;
    private double co2;
    private Boolean turbo;
    private Data dataRegistro;
 
    //construtor
    public Veiculo(int id, String marca, String modelo, int ano, String categoria, String[]combustivel, int cilindros, double cilindrada, String transmissao, String tracao, double consumoCidade, double consumoEstrada, double co2, Boolean turbo, Data dataRegistro){
        this.id = id;
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.categoria = categoria;
        this.combustivel = combustivel;
        this.cilindros = cilindros;
        this.cilindrada = cilindrada;
        this.transmissao = transmissao;
        this.tracao = tracao;
        this.consumoCidade = consumoCidade;
        this.consumoEstrada = consumoEstrada;
        this.co2 = co2;
        this.turbo = turbo;
        this.dataRegistro = dataRegistro;
    }
 
    //getters
    public int getId(){return this.id;}
    public String getMarca(){return this.marca;}
    public String getModelo(){return this.modelo;}
    public int getAno(){return this.ano;}
    public String getCategoria(){return this.categoria;}
    public String[] getCombustivel(){return this.combustivel;}
    public int getCilindros(){return this.cilindros;}
    public double getCilindrada(){return this.cilindrada;}
    public String getTransmissao(){return this.transmissao;}
    public String getTracao(){return this.tracao;}
    public double getConsumoCidade(){return this.consumoCidade;}
    public double getConsumoEstrada(){return this.consumoEstrada;}
    public double getCo2(){return this.co2;}
    public Boolean getTurbo(){return this.turbo;}
    public Data getData(){return this.dataRegistro;}
 
    public static Veiculo parseVeiculo(String s){
        String[] campos = s.split(",");
        int id = Integer.parseInt(campos[0]);
        String marca = campos[1];
        String modelo = campos[2];
        int ano = Integer.parseInt(campos[3]);
        String categoria = campos[4];
        String[] combustivel = campos[5].split(";"); //para separar combustíveis na mesma coluna
        int cilindros = Integer.parseInt(campos[6]);
        double cilindrada = Double.parseDouble(campos[7]);
        String transmissao = campos[8];
        String tracao = campos[9];
        double consumoCidade = Double.parseDouble(campos[10]);
        double consumoEstrada = Double.parseDouble(campos[11]);
        double co2 = Double.parseDouble(campos[12]);
        Boolean turbo = Boolean.parseBoolean(campos[13]);
        Data dataRegistro = Data.parseData(campos[14]);
 
        return new Veiculo(id, marca, modelo, ano, categoria, combustivel, cilindros, cilindrada, transmissao, tracao, consumoCidade, consumoEstrada, co2, turbo, dataRegistro);
    }
 
    public String format(){
        String combustiveis = "";//monta string de combustiveis ja que o veiculo pode ter mais de um tipo
        for(int i = 0; i < combustivel.length; i++){
            combustiveis += combustivel[i];
            if(i < combustivel.length -1){
                combustiveis += ",";
            }
        }
 
        return String.format("[%d ## %s ## %s ## %d ## %s ## %s ## %d ## %.1f ## %s ## %s ## %.1f ## %.1f ## %.1f ## %b ## %s]", id, marca, modelo, ano, categoria, combustiveis, cilindros, cilindrada, transmissao, tracao, consumoCidade, consumoEstrada, co2, turbo, dataRegistro.format());
    }
 
}
