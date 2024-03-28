package day17_scope;

public class C05_BaskaClassdanKullanma {

    public static void main(String[] args) {


        System.out.println(C04_StaticVariablesVsInstanceVariables.bashekimIsmi);

        C04_StaticVariablesVsInstanceVariables pers = new C04_StaticVariablesVsInstanceVariables();

        System.out.println(pers.perAdresi);

        System.out.println(pers.bashekimIsmi);


    }

}
