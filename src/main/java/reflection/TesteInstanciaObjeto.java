package reflection;

import controle.Controle;
import controle.SubControle;

public class TesteInstanciaObjeto {

    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
        Class<Controle> controleClasse1 = Controle.class;
        SubControle controle = new SubControle();
        Class<? extends Controle> controleClasse2 = controle.getClass();

        Class<?> controleClasse3 = Class.forName("controle.Controle");

        System.out.println(controleClasse1);
        System.out.println(controle);
        System.out.println(controleClasse3);

        Object objectControle = controleClasse1.newInstance();
        Object outroObjetoControle = controleClasse3.newInstance();

        System.out.println(objectControle instanceof Controle);
        System.out.println(outroObjetoControle instanceof Controle);
    }


}
