public class Jugador extends Entidad {
    private int experiencia;
    private int nivel;

    public Jugador(int vida, int ataque, int defensa, String nombre, int experiencia, int nivel) {
        super(vida, ataque, defensa, nombre);
        this.experiencia = experiencia;
        this.nivel = nivel;
    }

    @Override
    public int turno(int accion) { //Accion 1: ataque normal; Accion 2: ataque cargado; Accion 3: habilidad;
        int damage = 0;
        if (accion == 1) {
            damage = this.getAtaque() * this.nivel;
        } else if (accion == 2) {
            damage = this.getAtaque() * this.nivel + this.experiencia;
        } else if (accion == 3) {
            damage = this.getDefensa() * this.nivel;
        }
        return damage;
    }

}
