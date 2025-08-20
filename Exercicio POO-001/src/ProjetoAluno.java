        public class ProjetoAluno {
            String nome = "Emerson Kaua Mendes Fragoso";
            String matricula = "04177460";
            String endereco = "Travessa Piraja, Belém - PA";
            int idade = 19;
            String nomePai = "Emerson Santos Mendes";
            String nomeMae = "Ana Alice Fragoso Almeida";
            String email = "Kauzcoder.dev@gmail.com";
            String telefone = "(91) 98888-7777";

            String instituicao = "Universidade da Amazônia - UNAMA";
            String curso = "Ciência da Computação";
            String codigoSala = "CC1A-MANHÃ";
            int anoLetivo = 2025;

            String[] disciplinas = {
                        "POO", "Banco de dados", "Engenharia de Software",
                        "UX Design", "Estrutura de Dados", "ApeX", "Desenvolvimento Web"
            };


            double[][] notas = {
                    {8, 7.5, 9, 10},
                    {6, 5.5, 7, 6.5},
                    {7, 8, 6, 9},
                    {9, 8.5, 9.5, 10},
                    {5, 6, 4, 7},
                    {8, 9, 7, 8},
                    {10, 9, 9, 10}
            };

            int[][] falta = {
                    {1, 0, 2, 1},
                    {0, 1, 0, 2},
                    {2, 1, 1, 0},
                    {0, 0, 1, 0},
                    {1, 2, 1, 1},
                    {0, 1, 0, 0},
                    {0, 0, 0, 1}
            };

            double[] medias = new double[disciplinas.length];
            int[] totalFaltas = new int[disciplinas.length];
            String[] resultadoFinal = new String[disciplinas.length];


            void exibeInformacoesAluno() {
                System.out.println("----- DADOS DO ALUNO -----");
                System.out.println("Nome: " +this.nome);
                System.out.println("Idade: " +this.idade);
                System.out.println("Matricula: " +this.matricula);
                System.out.println("Endereço: " +this.endereco);
                System.out.println("Nome do pai: " +this.nomePai);
                System.out.println("Nome da mãe: " +this.nomeMae);
                System.out.println("Email: " +this.email);
                System.out.println("Numero de telefone: " +this.telefone);
                System.out.println("Instituição de ensino: " +this.instituicao);
                System.out.println("Nome do curso: " +this.curso);
                System.out.println("Codigo da sala: " +this.codigoSala);
                System.out.println("Ano letivo: " +this.anoLetivo);
                System.out.println("--------------------------");
            }

            void calculaMediaAluno() {
                for (int i = 0; i < disciplinas.length; i++) {
                    double somaNotas = 0;
                    int somaFaltas = 0;

                    for (int j = 0; j < 4; j++) {
                        somaNotas += notas[i][j];
                        somaFaltas += falta[i][j];
                    }

                    //Dados de condicionais para o boletim
                    medias[i] = somaNotas / 4.0;
                    totalFaltas[i] = somaFaltas;

                    if (medias[i] >= 6 && somaFaltas <= 20) {
                        resultadoFinal[i] = "Aprovado." ;
                    }
                    else if (medias[i] >= 4 && somaFaltas <= 20){
                        resultadoFinal[i] = "Prova Final.";
                    }
                    else {
                        resultadoFinal[i] = "Reprovado.";
                    }

                    //Dados para a tela
                    System.out.println("Disciplina: " + disciplinas[i]);
                    System.out.println("Média: " + medias[i]);
                    System.out.println("Total de faltas: " + totalFaltas[i]);
                    System.out.println("--------------------------");
                }
            }

            void mostraBoletim(){

                calculaMediaAluno();
                System.out.println("===== BOLETIM DO ALUNO =====");
                for (int i = 0; i < disciplinas.length; i++) {
                    System.out.println("Disciplina: " + disciplinas[i]);
                    System.out.print("Notas: ");
                    for (int j = 0; j < 4; j++) {
                        System.out.print(notas[i][j] + " ");
                    }
                    System.out.println("\nMédia: " + medias[i]);
                    System.out.println("Total de Faltas: " + totalFaltas[i]);
                    System.out.println("Resultado: " + resultadoFinal[i]);
                    System.out.println("----------------------------");
                }
            }
        }
