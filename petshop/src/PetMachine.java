public class PetMachine {
    private final int CAPACIDADE_MAXIMA_AGUA = 30;
    private final int CAPACIDADE_MAXIMA_SHAMPOO = 10;
    private final int CONSUMO_AGUA_BANHO = 10;
    private final int CONSUMO_SHAMPOO_BANHO = 2;
    private final int CONSUMO_AGUA_LIMPEZA = 3;
    private final int CONSUMO_SHAMPOO_LIMPEZA = 1;
    private boolean limpo = true;
    private int agua = CAPACIDADE_MAXIMA_AGUA;
    private int shampoo = CAPACIDADE_MAXIMA_SHAMPOO;
    private Pet pet;

    public void banhoPet(){
        if (pet == null) {
            System.out.println("Coloque o Pet na máquina para iniciar o banho");
            return;
        }

        this.agua -= CONSUMO_AGUA_BANHO;
        this.shampoo -= CONSUMO_SHAMPOO_BANHO;
        pet.setLimpo(true);
        System.out.printf("%nO Pet %s está limpo%n", pet.getNome());        
    }

    public void adicionarAgua(){
        if (agua == CAPACIDADE_MAXIMA_AGUA) {
            System.out.println("A capacidade de água está no nível máximo");
            return;
        }

        agua += 2;
        System.out.printf("O nivel da água agora é %d de %d litros%n", agua, CAPACIDADE_MAXIMA_AGUA);
    }

    public void adicionarShampoo(){
        if (shampoo == CAPACIDADE_MAXIMA_SHAMPOO) {
            System.out.println("A capacidade de água está no nível máximo");
            return;
        }

        shampoo += 2;
        System.out.printf("O nivel de shampoo agora é %d de %d litros%n", shampoo, CAPACIDADE_MAXIMA_SHAMPOO);
    }

    public int getShampoo() {
        return shampoo;
    }
    
    public int getAgua() {
        return agua;
    }

    public boolean temPet() {
        return pet != null;
    }

    public void adicionarPet(Pet pet) {
        if (!this.limpo) {
            System.out.println("A máquina não está limpa, para colocar um pet é necessário limpar a máquina");
            return;
        }

        if (temPet()) {
            System.out.printf("O pet %s já está na máquina nesse momento%n", this.pet.getNome());
            return;
        }

        this.pet = pet;
        System.out.printf("%nO pet %s foi colocado na máquina%n", pet.getNome());
    }

    public void retirarPet() {
        if (!temPet()) {
            System.out.println("Não há pet na máquina");
            return;
        }

        this.limpo = this.pet.estarLimpo();
        System.out.printf("O pet %s foi retirado%n", this.pet.getNome());
        this.pet = null;
    }

    public void limpar() {
        this.agua -= CONSUMO_AGUA_LIMPEZA;
        this.shampoo -= CONSUMO_SHAMPOO_LIMPEZA;
        this.limpo = true;
        System.out.println("A máquina foi limpa");
    }
}
