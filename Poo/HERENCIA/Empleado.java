package HERENCIA;


public class Empleado {
    public String nombres;
    private double sueldo;
    public Empleado() { }
    public Empleado(String nombres, double sueldo) {
        this.nombres = nombres;
        this.sueldo = sueldo;
    }
    public void setSueldo(double sueldo){
        this.sueldo = sueldo;
    }
    public double getSueldo() {
        return sueldo;
    }
}
class Gerente extends Empleado {
    public String departamento;
    public String secretaria;
    public Gerente() { }
    public Gerente(String departamento, String secretaria) {
        this.departamento = departamento;
        this.secretaria = secretaria;
    }
    public Gerente(String departamento, String secretaria,
                   String nombres, double sueldo) {
        super(nombres, sueldo);
        this.departamento = departamento;
        this.secretaria = secretaria;
    }
    @Override
    public String toString(){
        return String.format("Nombres: %s \nSueldo: %.2f \n"
                        + "Depatamento: %s \nSecretaria: %s"
                ,this.nombres, this.getSueldo(),
                this.departamento, this.secretaria);
    }
}

class Operario extends Empleado {
    private double horasLaboradas;
    private double costoHora;
    private double horasExtras;
    public Operario() { }
    public Operario(double horasLaboradas,double horasExtras) {
        this.horasLaboradas = horasLaboradas;
        this.horasExtras = horasExtras;
    }
    public Operario(double horasLaboradas, String nombres,
                    double sueldo) {
        super(nombres, sueldo);
        this.horasLaboradas = horasLaboradas;

    }
    public void setSueldo(double horasLaboradas, double costoHora){
        this.horasLaboradas = horasLaboradas;
        this.costoHora = costoHora;
        this.setSueldo(this.horasLaboradas * this.costoHora);
    }
    public void  setHorasExtras(double horasExtras){
        this.horasExtras=horasExtras;
    }
    public double getHoras(){
        return this.horasExtras;
    }
    public void CalcularHorasExtras(double horasExtras){
        this.horasExtras =horasExtras;
        this.horasExtras=(this.costoHora*this.horasExtras);
        this.setSueldo(this.horasLaboradas+getSueldo());
    }


    @Override
    public String toString(){
        return String.format("Nombres: %s \nSueldo: %.2f \n"
                        + "Horas Laboradas: %.2f \n"
                        + "Costo por hora: %.2f\n"
                        +" Horas extras: %2.f\n"
                        + "Pago Adicional por horas extras: %.2f"
                ,this.nombres, this.getSueldo(),
                this.horasLaboradas,
                this.getHoras(),
                this.costoHora,
                this.horasExtras);
    }
}

class TestEmpleadoGerentOperar{
    public static void main(String[] args) {
        //Valida si el sueldo es mayor a cero para inicializar la variable.a
        Gerente gerente1 = new Gerente("Comput. y Elect.",
                "Laydi Sanmartin", "Juan Carrion" ,100);
        Operario operario1 = new Operario(46.50,
                "Maria Vilareal" ,200);
        operario1.setSueldo(80, 20);
        operario1.setHorasExtras(30);
        operario1.CalcularHorasExtras(30);
        System.out.println("GERENTE 1\n=========\n"+gerente1);
        System.out.println("\nOPERARIO 1\n==========\n"+operario1);

    }
}

