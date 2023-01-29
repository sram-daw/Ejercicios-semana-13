public class Enemigo extends Entidad {
    private int dificultad;

    public Enemigo(int vida, int ataque, int defensa, String nombre, int dificultad) {
        super(vida, ataque, defensa, nombre);
        this.dificultad = dificultad;
    }

    @Override
    public int turno(int accion) { //Accion 1: ataque normal; Accion 2: ataque cargado; Accion 3: habilidad;
        int damage = 0;
        if (accion == 1) {
            damage = this.getAtaque() * (this.dificultad * 2);
        } else if (accion == 2) {
            damage = this.getAtaque() * (this.dificultad * 3);
        } else if (accion == 3) {
            damage = this.getDefensa() * (this.dificultad * 4) + this.getAtaque();
        }
        return damage;
    }
}
