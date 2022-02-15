package reflection;

import controle.SubControle;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class TesteInstanciaObjeotoCorretamente {

    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Class<SubControle> subControleClass1 = SubControle.class;

        Class<?> subControleClasse2 = Class.forName("controle.SubControle");

        Class<?> controleClasse1 = Class.forName("controle.Controle");

        Constructor<SubControle> construtorSubControle =  subControleClass1.getDeclaredConstructor();

        Object subControle =  construtorSubControle.newInstance();

        System.out.println(subControle);

    }
}
