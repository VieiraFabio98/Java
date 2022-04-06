//Uma empresa precisa automatizar o processo de cadastro de seus funcionários. Desenvolva
//uma aplicação que realiza o processo de cadastro, sabendo que um funcionário possui seu
//número de registro, nome completo, data de nascimento, sexo, setor em que trabalha,
//telefone e endereço. O endereço é formado pelo nome da rua, número, bairro, cidade e
//estado. Deve ser possível emitir um relatório com os dados do funcionário. Utilize uma classe
//de teste para instanciar os funcionários, bem como atribuir valores aos seus dados e invocar
//os métodos a fim de testá-los
package cadastro;

import java.util.*;
import java.io.*;

public class Cadastro
{
    Scanner entradaTeclado = new Scanner(System.in);

    private int registro, dataNascimento, telefone;
    private String nome, sexo,setor;
    private String endereco[] = new String [4];

    @Override
    public String toString() {
        return "Cadastro [dataNascimento=" + dataNascimento + ", entradaTeclado=" + entradaTeclado + ", nome=" + nome
                + ", registro=" + registro + ", setor=" + setor + ", sexo=" + sexo + ", telefone=" + telefone + "]";
    }

    Cadastro()
    {
        cadastrarInfo();
    }

    private void cadastrarInfo()
    {
        System.out.println("informe o seu registro: ");
        this.registro = entradaTeclado.nextInt();
        entradaTeclado.nextLine();
        System.out.println("infomre o ano de nascimento: ");
        this.dataNascimento = entradaTeclado.nextInt();
        entradaTeclado.nextLine();
        System.out.println("Informe seu telefone");
        this.telefone = entradaTeclado.nextInt();
        entradaTeclado.nextLine();
        System.out.println("Informe seu nome: ");
        this.nome = entradaTeclado.nextLine();
        System.out.println("Informe seu sexo: ");
        this.sexo = entradaTeclado.nextLine();
        System.out.println("Informe seu setor: ");
        this.setor = entradaTeclado.nextLine();
        System.out.println("Informe seu endereço: ");
        for(int i = 0; i < 4; i++)
        {
            endereco[i] = entradaTeclado.nextLine();
        }
        
        
    }

    //public String[] getEndereco() 
    //{
     //   return endereco;
    //}



}