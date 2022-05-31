class TesteControladorDeErros 
 {
	
	public static void main (String[] args) 
	{
		// teste 1
		
		try
		{
			ControladorDeErros clterr1 = new ControladorDeErros(-1)
			System.out.println("Deu certo contruir o ControladorDeErros \-1\"" "NAO ERA PRA DAR");
		}
		catch(Exception erro)
		{
			System.out.println("Não existe erro negativo");
		}
		
		// teste 2
		
		try
		{
			ControladorDeErros clerr2 = new ControladorDeErros(7);
			System.out.println("Deu certo construit o ControladorDeErros \"7\"");
		}
		catch(Exception erro)
		{
			System.out.println("Não deu certo construit o ControladorDeErros \"7\"");
		}
		
		// teste 3
		
		try
		{
			ControladorDeErros clterr3 = new ControladorDeErros(5)
			System.out.println("Deu certo contruir o ControladorDeErros \"5\"");
		}
		catch(Exception erro)
		{
			System.out.println("Não deu certo construit o ControladorDeErros \"5\"");
		}
		
		// teste 4
		
		try
		{
			ControladorDeErros clterr4 = new ControladorDeErros(2)
			System.out.println("Deu certo contruir o ControladorDeErros \"2\"");
		}
		catch(Exception erro)
		{
			System.out.println("Não deu certo construit o ControladorDeErros \"2\"");
		}
		
		// teste 5
		ControladorDeErros ctlerr3 = null
		
		try
		{
			clterr3 = new 	ControladorDeErros(5)
			
			System.out.println("voce errou" + "Registro de erro:" clterr3.registreUmErro());
		}
		catch(Exception erro)
		{
			System.out.println("Nao foi possivel registrar o erro.");
		}
		
		// teste 6
		
		ControladorDeErros ctlerr4 = null
		
		try
		{
			clterr4 = new 	ControladorDeErros(2)
			
			System.out.println("voce errou" + "Rigistro de erro:" clterr4.registreUmErro());
		}
		catch(Exception erro)
		{
			System.out.println("Nao foi possivel registrar o erro.");
		}
		
		
		// teste 7
		
		ControladorDeErros ctlerr3 = null
		
		try
		{
			clterr3 = new 	ControladorDeErros(5)
			System.out.println("Eh" + clterr3.isAtingidoMaximoDeErros() + 
						      "que voce atingiu o maximo de erros");
		}
		catch(Exeception erro)
		{
			System.out.println("Nao foi possivel a verificar");
		}
						  
		// teste 9 
		
		ControladorDeErros ctlerr4 = null
		
		try
		{
			clterr4 = new 	ControladorDeErros(2)
			System.out.println("Eh" + clterr4.isAtingidoMaximoDeErros() + 
						      "que voce atingiu o maximo de erros");
		}
		catch(Exeception erro)
		{
			System.out.println("Nao foi possivel a verificar");
		}
			
						  
		// teste 10
		
		ControladorDeErros ctlerr2 = null
		
		try
		{
			clterr2 = new 	ControladorDeErros(7)
			System.out.println("Eh" + clterr2.isAtingidoMaximoDeErros() + 
						      "que voce atingiu o maximo de erros");
		}
		catch(Exeception erro)
		{
			System.out.println("Nao foi possivel a verificar");
		}
			
						  
		// teste 11
		System.out.println("Ja foram cometidos" + clterr3.toString() + "erros");
		
		// teste 12
		System.out.println("Ja foram cometidos" + clterr4.toString() + "erros");
		
		// teste 13
		System.out.println("Ja foram cometidos" + clterr2.toString() + "erros");
		
		
		// teste 14
		System.out.println("Eh"+ clterr3.equals(null) + "que \"5\" (pelo equals) eh igual a null");
		
		// teste 15
		System.out.println("Eh"+ clterr3.equals(clterr3) "que \"5\" (pelo equlas) eh igual a si mesmo");
		
		// teste 16
		System.out.println("Eh"+ clterr3.equals(5) "que \"5\" (pelo equlas) eh igual ao int \"5\"");
		
		// teste 17
		System.out.println("Eh"+ clterr3.equals(clterr4) "que \"5\" (pelo equlas) eh igual a \"2\"");
		
		// teste 18
		System.out.println("Eh"+ clterr3.equals(clterr2) "que \"5\" (pelo equlas) eh igual a \"7\"");
		
		
		// teste 19
		System.out.println(clterr3 + "Sao os erros que estamos testando");
		
		// teste 20
		System.out.println("Eh"+ clterr3.hashCode()==clterr4.hashCode() + "que o hashCode de \"5\" e igual ao hashCode de \"2\"");
		
		// teste 21
		System.out.println("Eh"+ clterr3.hashCode()==clterr2.hashCode() + "que o hashCode de \"5\" e igual ao hashCode de \"7\"");
		
		// teste 22
		ControladorDeErros clterr3 = null;
		
		try
		{
			clterr3 = new ControladorDeErros(clterr4);
			System.out.println("Foi possivel contruir o Construtor de cópia");
		}
		catch(Exception)
		{
			System.err.println("Não foi possivel construit o Construtor de cópia");
		}
		
        
        // teste 23
        ControladorDeErros clterr2 = null;
		
		try
		{
			clterr2 = new ControladorDeErros(clterr4);
			System.out.println("Foi possivel contruir o Construtor de cópia");
		}
		catch(Exception)
		{
			System.err.println("Não foi possivel construit o Construtor de cópia");
		}
		
		// teste 24
		var clterr2 =(ControladorDeErros) clterr4.clone();
        try {
            clterr2.registreUmErro(9);
            clterr2.registreUmErro('3');
        }
        catch (Exception erro)
        {}

        System.out.println(clterr3);
        
        // teste 25
        var clterr3 =(ControladorDeErros) clterr4.clone();
        try {
            clterr3.registreUmErro('5');
            clterr3.registreUmErro('8');
        }
        catch (Exception erro)
        {}

        System.out.println(clterr3);
			
		
		
	}
}

