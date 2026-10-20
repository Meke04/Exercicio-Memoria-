//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main(String[] args) {

    Pessoa pessoa1 = new Pessoa("meke", 24);
    Pessoa pessoa2 = new Pessoa("meke", 24);

    System.out.println(pessoa1);
    System.out.println(pessoa2);
    System.out.println("");
    System.out.println(pessoa1.equals(pessoa2));
    System.out.println("");

    Pessoa pessoa3 = new Pessoa("meke", 25);
    Pessoa pessoa4 = new Pessoa("Filipe", 25);

    Set<Pessoa> pessoas = new HashSet<>();
    pessoas.add(pessoa1);
    pessoas.add(pessoa2);
    pessoas.add(pessoa3);
    pessoas.add(pessoa4);

    for (Pessoa pessoa : pessoas) {
        System.out.println(pessoa);
    }

    System.out.println("");
    System.out.println("E mostrado apenas 3 pessoas mesmo contendo 4 no total por 2 delas possuirem valores iguais, e como implementamos equals() e hashCode fazemos o HashSet reconhecer os 2 objetos como iguais");
}
