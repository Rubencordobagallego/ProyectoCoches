public class Proyectocoche {
    public static class Coche {
    private String marca;
    private String modelo;
    private int anio;
    public Coche(String marca, String modelo, int anio) {
        this.marca = marca;
        this.modelo = modelo;
        this.anio = anio;
    }
    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public int getAnio() {
        return anio;
    }
    public void setAnio(int anio) {
        this.anio = anio;
    }
    @Override
    public String toString() {
        return "Coche{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", anio=" + anio +
                '}';
    }
}
    public static class Cliente {
        private String nombre;
        private String telefono;
        public Cliente(String nombre, String telefono) {
            this.nombre = nombre;
            this.telefono = telefono;
        }
        public String getNombre() {
            return nombre;
        }
        public void setNombre(String nombre) {
            this.nombre = nombre;
        }
        public String getTelefono() {
            return telefono;
        }
        public void setTelefono(String telefono) {
            this.telefono = telefono;
        }
        @Override
        public String toString() {
            return "Cliente{" +
                    "nombre='" + nombre + '\'' +
                    ", telefono='" + telefono + '\'' +
                    '}';
        }
    }

}
