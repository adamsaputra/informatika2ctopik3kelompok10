package gameproject;

public class Player  {
private String nama;
    private double gold,gem;
    public Player(String nm, double gold,double gem) {
    setNama(nm);
    setGold(gold);
    setGem(gem);
    }
    public void setNama (String nm){
    this.nama=nm;
    }
    public void setGold(double gold) {
    this.gold=gold;
    }
    public void setGem(double gem) {
    this.gem=gem;
    }
    public String getNama(){
        return nama;
    }
    public double getGold(){
        return gold;
    }
    public double getGem(){
        return gem;
    }
    
}

