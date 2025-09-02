//PENSE no Java como uma enorme POO

class Dog { //Declarando uma clase
    int size; //Definindo as intancias da classe(o que a classe é)
    String breed;
    String name;
    void bark(){ //Declarando o seu metodo(o que a classe faz)
        System.out.println("Ruf! Ruf! Ruf!");
    }
}

class DogTest{
    public static void main(String[] args){
        Dog d = new Dog(); //Criando um objeto com a classe DOG
        d.size = 40;       // Atribuindo valores as instâncias (não esquecer do .)
        d.bark();
    }
}