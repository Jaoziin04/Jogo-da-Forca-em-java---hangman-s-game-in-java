class TesteControladorDeLetrasJaDigitadas 
 {
	
	public static void main (String[] args) 
	{
		// teste 1
		
		try
		{
			
			ControladorDeLetrasJaDigitadas ctL1  = new ControladorDeLetrasJaDigitadas("");
			System.out.println("Foi possivel contruir o ControladorDeLetrasJaDigitadas \"\""");
			
		}
		catch(Exception erro)
		{
			 System.err.println("Não foi pssivel contruir o ControladorDeLetrasJaDigitadas \"\"");
		}
		
		// teste 2
		
		
		ControladorDeLetrasJaDigitadas clt2 = null;
		
		try
		{
			clt2 = new ControladorDeLetrasJaDigitadas("KAKAROTO");
			System.out.println("Foi possivel construir o ControladorDeLetrasJaDigitadas\"KAKAOTO\"");
		}
		catch(Exception erro)
		{
			System.err.println("Não foi possivel contruir o ControladorDeLetrasJaDigitadas\"KAKAROTO\"");
		}
		
		// teste 3
		
		ControladorDeLetrasJaDigitadas clt3 = null;
		
		try
		{
			clt3 = new ControladorDeLetrasJaDigitadas("ACARAJE");
			System.out.println("Foi possivel contruir o ControladorDeLetrasJaDigitadas\"ACARAJÉ\"");
		}
		catch(Exception)
		{
			System.err.println("Não foi possivel construit o ControladorDeLetrasJaDigitadas\"ACARAJE\"");
		}
		
		// teste 4
		
		ControladorDeLetrasJaDigitadas clt4 = null;
		
		{
			clt4 = new ControladorDeLetrasJaDigitadas("NEYMAR");
			System.out.println("Foi possivel contruir o ControladorDeLetrasJaDigitadas\"NEYMAR\"");
		}
		catch(Exception)
		{
			System.err.println("Não foi possivel construit o ControladorDeLetrasJaDigitadas\"NEYMAR\"");
		}
		
		// teste 5
		
		System.out.println(" Eh" + 
						  ctl3.isJaDigitada('A') +
						  "que "\"ACARAJÉ\" possui a letra 'A'");
						  
		// teste 6
		System.out.println(" Eh" +
						  ctl3.isJaDigitada('Y') +
						  "que "\"ACARAJÉ\"possui a letra 'Y'");
						  
		// teste 7
		
		try
		{
			 ctl3.registre('A'));
			 System.out.println("Letra 'A' foi registrada");
		}
		catch(Exception)
		{
			System.err.print("Letra 'A' já foi digitada");
		}
		
		
		// teste 8
		
		try
		{
			System.out.println("Registe a letra 'A' de \"ACARAJE\"na segunda posição" +
							   clt3.registre('A'));
			System.err.println("Não conseguimos erro registrar a letra 'A' na segunda posição de \"ACARAJE\"E NÃO ERA PRA REGISTRAR MESMO");
		}
		catch
		{
			System.out.println("Não foi possivel icluir a letra 'A' na segunda posição de \"ACARAJE\"E NÃO ERA PRA SER POSSIVEL MESMO");
		}
		
		// teste 9
		
		try
		{
			ctl3.registre('J'));
			System.out.println("Letra 'J' foi registrada");
		}
		catch
		{
			System.out.println("Letra 'J' já foi digitda");
		}
		
		// teste 10
		
		try
		{
			System.out.println("Registe a letra 'J' de \"ACARARAJE\"na segunda posição" +
							   clt3.registre('J'));
			System.err.println("Não conseguimos erro registrar a letra 'J' na segunda posição de \"ACARAJÉ\"E NÃO ERA PRA REGISTRAR MESMO");
		}
		catch
		{
			System.out.println("Não foi possivel icluir a letra 'J' na segunda posição de \"ACARAJÉ\"E NÃO ERA PRA SER POSSIVEL MESMO");
		}
		
		//teste 11
		
		System.out.println("Já fotram digitadas as seguintes letras da palavra \"ACARAJE\"" + 
						   ctl3.toString());
						   
		// teste 12
		System.out.println(ctl3 +"Eh a palavra que estamos testando");
		
		// teste 13
		System.out.prtinln("Eh" + ctl3.hashCode()==ctl4.hashCode() + "que o hashCode de \"ACARAJE""\"é igual ao hashCode de \"NEYMAR""\"");
		
		// teste 14
		System.out.println("Eh" + ctl3.hashCode()==ctl2.hashCode() + "que o hashCode de \"ACARAJE""\"é igual ao hashCode de \"KAKAROTO""\"");
		
		// teste 15
		try
		{
			 ControladorDeLetrasJaDigitadas clt3 = clt3.clone();
		}
		catch(Exception erro)
		{clt3 +"Não eh igual a "cly3};

			System.out.println("Eh"+clt3.equals(clt3)+"que acarajé é igual a acarajé");
		
		// teste 16
		var ctl3 =(ControladorDeLetrasJaDigitadas) ctl4.clone();
        try {
            ctl3.registre('A');
            ctl3.registre('B');
        }
        catch (Exception erro)
        {}

        System.out.println(clt3);
    }
		
		// teste 17
		var clt4 =(ControladorDeLetrasJaDigitadas) clt3.clone();
        try {
            clt4.registre('Y');
            clt4.registre('Z');
        }
        catch (Exception erro)
        {}

        System.out.println(clt4);
    }
		
		// teste 18
		ControladorDeLetrasJaDigitadas clt3 = null;
		
		try
		{
			clt3 = new ControladorDeLetrasJaDigitadas(clt4);
			System.out.println("Foi possivel contruir o Construtor de cópia");
		}
		catch(Exception)
		{
			System.err.println("Não foi possivel construir o Construtor de cópia");
		}
		
		
		// teste 19
		ControladorDeLetrasJaDigitadas clt4 = null;
		
		try
		{
			clt4 = new ControladorDeLetrasJaDigitadas(clt3);
			System.out.println("Foi possivel contruir o Construtor de Cópia");
		}
		catch(Exception)
		{
			System.err.println("Não foi possivel construit o Construtor de cópia");
		}
		
	}
}

