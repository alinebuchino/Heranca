package heranca;
    public class Heranca {
        public static void main(String[] args) {
            //Pessoa p1 = new Pessoa();
            /*Visitante v1 = new Visitante();
            v1.setNome("Juvenal");
            v1.setIdade(18);
            v1.setSexo("M);
            System.out.println(v1.toString()); */
            
            Aluno al = new Aluno();
            al.setNome("Cláudio");
            al.setMatricula(1111);
            al.setCurso("Informática");
            al.setIdade(22);
            al.setSexo("M");
            al.pagarMensalidade();
            
            Bolsista bo = new Bolsista();
            bo.setNome("Jubileu");
            bo.setMatricula(1112);
            bo.setBolsa(12.5f);
            bo.setSexo("M");
            bo.pagarMensalidade();         
    }    
}
