public class conversorNotas {
    private int notas;
    public conversorNotas(int notas){
        this.notas = notas;
        
    }
    public void setNotas(int notas) {
        this.notas = notas;
    }

    public String conversor() throws NotaFueraDeRangoException{
        if (notas < 0 || notas > 10) {
            throw new NotaFueraDeRangoException("nota fuera de rango");
        }
        else if(notas < 5){
           return "Suspenso";
        }
        else if (notas == 5) {
            return "Aprobado";
        }
        else if (notas == 6 ) {
            return "Bien";
        }
        else if (notas >= 7 && notas <= 8) {
            return "Notable";
        }
        else{
            return "Sobresaliente";
        }
    }
}
