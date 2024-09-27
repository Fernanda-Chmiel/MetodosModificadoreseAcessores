package metodosmodificadoresacessores;

public class MetodosModificadoresAcessores {

    public static void main(String[] args) {
          //ex1
//        // produtos
//        Produto_ex1 BodySplash = new Produto_ex1("Body Splash", 50); // estoque inicial = 50
//        Produto_ex1 Perfume = new Produto_ex1("Perfume", 27); //  estoque inicial = 27
//
//        //fornecedor
//        Fornecedor_ex1 fornecedor = new Fornecedor_ex1("Natura");
//
//        //pedidos
//        Pedido_ex1 pedido = new Pedido_ex1(fornecedor, BodySplash, 100); // estoque final = 150
//        Pedido_ex1 pedido1 = new Pedido_ex1(fornecedor, Perfume, 25); // estoque final = 52
//
//        // processar pedidos
//        pedido.processar();
//        pedido1.processar();
//
//        // estoque baixo
//        Pedido_ex1.listarEstoqueBaixo(60); // mostra produtos abaixo de 60 unidades

          //ex2
//        Funcionarios_ex2 Fernanda = new Funcionarios_ex2("Fernanda", 8000); // funcionário
//        Funcionarios_ex2 Eduarda = new Funcionarios_ex2("Eduarda", 3000);
//        Funcionarios_ex2 Lorena = new Funcionarios_ex2("Lorena", 1000);
//
//        Departamentos_ex2 Administrativo = new Departamentos_ex2("Administrativo"); //departamneto
//        Departamentos_ex2 Marketing  = new Departamentos_ex2("Marketing");
//
//        Projetos_ex2 projeto1 = new Projetos_ex2("Investir em ações de fornecedores"); // projeto
//        Projetos_ex2 projeto2 = new Projetos_ex2("Churrasco toda sexta");
//
//        Administrativo.adicionarFuncionario(Fernanda); // departamento do funcionario
//        Administrativo.adicionarFuncionario(Eduarda);
//        Marketing.adicionarFuncionario(Lorena);
//
//        Fernanda.adicionarProjeto(projeto1); // colocar um funcionario a um projeto
//        Eduarda.adicionarProjeto(projeto1);
//        Eduarda.adicionarProjeto(projeto2);
//        Lorena.adicionarProjeto(projeto2);
//
//        Fernanda.exibirProjetos(); // Exibe projetos
//        Eduarda.exibirProjetos();
//
//        System.out.println("Média Salarial do Departamento Administrativo: " + Administrativo.calcularMediaSalarial()); // média salarial
//        
          //ex3
//        Usuarios_ex3 vinicius = new Usuarios_ex3("Vinicius");
//        Usuarios_ex3 jorge = new Usuarios_ex3("Jorge");
//
//        vinicius.criarPostagem("Bom dia!");
//        jorge.criarPostagem("Amo açaí, como pode ser tão bom?");
//
//        Publicacoes_ex3 primeiraPublicacao = vinicius.getPostagem().get(0);
//        Comentarios_ex3 comentario = new Comentarios_ex3(jorge, "Bom dia!");
//        primeiraPublicacao.adicionarComentario(comentario);
//        
//        Publicacoes_ex3 segundaPublicacao = jorge.getPostagem().get(0);
//        Comentarios_ex3 comentario1 = new Comentarios_ex3(vinicius, "vdd, concordo!!!");
//        segundaPublicacao.adicionarComentario(comentario1);
//
//        vinicius.listarPostagem();
//        jorge.listarPostagem();

          // ex4
//        Passageiro_ex4 pessoa1 = new Passageiro_ex4("Peter Parker");
//
//        Reserva_ex4 reserva1 = new Reserva_ex4("Cancun, México");
//   
//        Voo_ex4 infoVOO = new Voo_ex4("1903", "Disponível");
//
//        pessoa1.addReservas(reserva1);
//    
//        reserva1.addVoos(infoVOO);
//    
//        pessoa1.exibir(); // exibir apenas o 1° passageiro 
//        
          // ex5
          
//        Pacientes_ex5 paciente = new Pacientes_ex5("Carlos Sainz");
//
//        Medicos_ex5 medico = new Medicos_ex5("Dr. Max Verstappen", "Cardiologista");
//
//        Consultas_ex5 consulta = new Consultas_ex5(paciente, medico, "05/08/2024 ás 17:00");
//
//        System.out.println("Paciente: " + paciente.getNome());
//        System.out.println("Médico: " + medico.getNome() + ", Especialidade: " + medico.getEspecialidade());
//        System.out.println("Consulta -> Paciente: " + consulta.getPaciente().getNome() + ", Médico: " + consulta.getMedico().getNome() + ", Data e Hora: " + consulta.getDataHora());
          
          // ex6
          
        // Marca
//        Marcas_ex6 mclaren = new Marcas_ex6();
//        mclaren.setNome("McLaren");
//
//        // Carros
//        Carros_ex6 carro1 = new Carros_ex6("720S", mclaren);
//        carro1.setPreco(1000000);
//        Carros_ex6 carro2 = new Carros_ex6("P1", mclaren);
//        carro2.setPreco(2000000);
//
//        //Média
//        double media = (carro1.getPreco() + carro2.getPreco()) / 2;
//
//        Vendedores_ex6 vendedor = new Vendedores_ex6("Gabriel Bortoleto", carro2);
//
//        System.out.println("Média de Preço das McLaren's: " + media + "R$");
//        System.out.println("Carro Vendido: " + vendedor.getCarroVendido().getModelo());

          // ex7
//        Autores_ex7 autor2 = new Autores_ex7("Emily Henry");
//
//        // Livro
//        Livros_ex7 livro1 = new Livros_ex7("Amor & Gelato", autor1);
//        Livros_ex7 livro2 = new Livros_ex7("Loucos por Livros", autor2);
//
//        // Empréstimos
//        Emprestimos_ex7 emprestimo1 = new Emprestimos_ex7(livro1, 35); // atraso
//        Emprestimos_ex7 emprestimo2 = new Emprestimos_ex7(livro2, 9); // atraso
//        Emprestimos_ex7 emprestimo3 = new Emprestimos_ex7(livro1, 0); // s atraso
//
//        // Multas
//        System.out.println("Multa do livro " + livro1.Titulo + ": R$" + emprestimo1.Multa());
//        System.out.println("Multa do livro " + livro2.Titulo + ": R$" + emprestimo2.Multa());
//
//        // Livro Popular
//        System.out.println("Livros populares:");
//        System.out.println(livro1.Titulo + " - " + livro1.getEmprestimos() + " empréstimos");
//        System.out.println(livro2.Titulo + " - " + livro2.getEmprestimos() + " empréstimos");
          
          //ex8
//        Desenvolvedores_ex8 dev1 = new Desenvolvedores_ex8("Juliano");
//        Desenvolvedores_ex8 dev2 = new Desenvolvedores_ex8("Paula");  
//        
//        Tarefas_ex8 tarefa1 = new Tarefas_ex8("Criação de um novo site", 3);
//        Tarefas_ex8 tarefa2 = new Tarefas_ex8("Manutenção do site", 5);
//        
//        // Criar projetos
//        Projetos_ex8 projeto1 = new Projetos_ex8("Criação");
//        Projetos_ex8 projeto2 = new Projetos_ex8("Manutenção");
//        
//        dev1.adicionarTarefas(tarefa1);
//        dev2.adicionarTarefas(tarefa2);
//        
//        projeto1.adicionarTarefas(tarefa1);
//        projeto2.adicionarTarefas(tarefa2);
//        
//        // Mostrar tarefas de cada desenvolvedor
//        dev1.Mostrar();
//        dev2.Mostrar();
//        
//        System.out.println("Carga de trabalho do projeto " + projeto1.getNome() + ": " + projeto1.Carga() + "h");
//        System.out.println("Carga de trabalho do projeto " + projeto2.getNome() + ": " + projeto2.Carga() + "h");
          
          // ex9
          
//        //prato
//        Pratos_ex9 prato1 = new Pratos_ex9("Lasanha Bolonhesa", 60);
//        Pratos_ex9 prato2 = new Pratos_ex9("Batata Frita", 30);
//    
//        //mesa
//        Mesas_ex9 mesa1 = new Mesas_ex9("1");
//        Mesas_ex9 mesa2 = new Mesas_ex9("2");
//        Mesas_ex9 mesa3 = new Mesas_ex9("3");
//        Mesas_ex9 mesa4 = new Mesas_ex9("4");
//    
//        // pedidos
//        Pedidos_ex9 pedido1 = new Pedidos_ex9("1° pedido");
//        Pedidos_ex9 pedido2 = new Pedidos_ex9("2° pedido");
//    
//        // add pratos a um pedidos
//        pedido1.addPrato(prato2);
//        pedido2.addPrato(prato1);
//    
//        //add mesa a um pedidos
//        mesa1.addPedido(pedido1);
//        mesa2.addPedido(pedido2);
//    
//        Mesas_ex9 reserva1 = new Mesas_ex9("José");
//        Mesas_ex9 reserva2 = new Mesas_ex9("Ana");
//    
//
//        mesa3.addReserva(reserva1);
//        mesa4.addReserva(reserva2); 
//    
//        mesa1.exibir();
//        System.out.println("----------------------");
//        mesa2.exibir();
//        System.out.println("----------------------");
//        mesa3.exibir();
//        System.out.println("----------------------");
//        mesa4.exibir(); 

          //ex10
    
        Estudantes_ex10 aluno1 = new Estudantes_ex10("Bianca", 10);
        Estudantes_ex10 aluno2 = new Estudantes_ex10("Isadora", 4);
        Estudantes_ex10 aluno3 = new Estudantes_ex10("Renata", 7);
    
        Professores_ex10 teacher1 = new Professores_ex10("Sérgio");
        Professores_ex10 teacher2 = new Professores_ex10("Daniel");
    
        Disciplinas_ex10 materia1 = new Disciplinas_ex10("História");
        Disciplinas_ex10 materia2 = new Disciplinas_ex10("Geografia");
    
        materia1.addEstudantes(aluno1);
        materia2.addEstudantes(aluno2);
        materia2.addEstudantes(aluno3);
   
        teacher1.addDisciplinas(materia1);
        teacher2.addDisciplinas(materia2);
    
    
         teacher1.Mostrar();
         System.out.println("Média: " + materia1.getDisciplina() + " - " + materia1.media());
         System.out.println("--------------------");
         teacher2.Mostrar();
         System.out.println("Média: " + materia2.getDisciplina() + " - " + materia2.media());

    }
    
}
