class TesteDeTracinhos 
{
	
	public static void main (String[] args) 
	{
		// teste 1
		
		try
		{
			Tracinhos tr1 = new Tracinhos(-1)
			System.out.println("Foi possivel construir o Tracinhos \"-1\"E NAO ERA PRA SER")
		}
		catch(Exception erro)
		{
			System.out.println("Nao foi possivel contrstruit o Tracinhos \"-1\"")
		}
		
		// teste 2
		
		try
		{
			Tracinhos tr2 = new Tracinhos(5)
			System.out.println("Foi possivel construir o Tracinhos \"5\"")
		}
		catch(Exception erro)
		{
			System.out.println("Nao foi possivel contrstruit o Tracinhos \"5\"")
		}
		
		// teste 3
		try
		{
			Tracinhos tr3 = new Tracinhos(8)
			System.out.println("Foi possivel construir o Tracinhos \"8\"")
		}
		catch(Exception erro)
		{
			System.out.println("Nao foi possivel contrstruit o Tracinhos \"8\"")
		}
		
		// teste 4
		try
		{
			Tracinhos tr4 = new Tracinhos(3)
			System.out.println("Foi possivel construir o Tracinhos \"3\"")
		}
		catch(Exception erro)
		{
			System.out.println("Nao foi possivel contrstruit o Tracinhos \"3\"")
		}
		
		// teste 5
		Tracinhos tr3 = null
		
		try
		{
			tr3 = new Tracinhos(8)
			System.out.println(tr3.revele(8, A) + "letra 'A' revelada na posicao \"8\"")
		}
		catch(Excepition erro)
		{
			System.out.println("Essa letra nao existe, nessa posiçao")
		}
		
		// teste 6
		Tracinhos tr2 = null
		
		try
		{
			tr2 = new Tracinhos(5)
			System.out.println(tr2.revele(5, J) + "letra 'J' revelada na posicao \"5\"")
		}
		catch(Excepition erro)
		{
			System.out.println("Essa letra nao existe, nessa posiçao")
		}
		
		
		// teste 7
		Tracinhos tr4 = null
		
		try
		{
			tr4 = new Tracinhos(3)
			System.out.println(tr4.revele(3, B) + "letra 'B' revelada na posicao \"3\"")
		}
		catch(Excepition erro)
		{
			System.out.println("Essa letra nao existe, nessa posiçao")
		}
		
		// teste 8
		System.out.println("Eh" + tr3.isAindaComTracinhos() + "Que a palvra ainda possui tracinhos");
		
		// teste 9
		System.out.println("Eh" + tr4.isAindaComTracinhos() + "Que a palavra ainda possui tracihos");
		
		// teste 10
		System.out.println("Eh" + tr2.isAindaComTracinhos() + "que a palavra ainda possui tracinhos");
		
		// teste 11
		System.out.println("A palavra possui" + tr3.toString() + "tracinhos");
		
		// teste 12
		System.out.println("A palavra possui" + tr4.toString() + "tracinhos");
		
		// teste 13
		System.out.println("A palavra possui" + tr2.toString() + "tracinhos");
		
		// teste 14
		System.out.println("Eh" + tr3.equals(null) + "que (pelo equals) 8 e igual a null");
		
		// teste 15
		System.out.println("Eh" + tr3.equals(tr3) + "que (pelo equals) 8 e igual a si mesmo");
		
		// teste 16
		System.out.println("Eh" + tr3.equals(8) + "que (pelo equals) 8 e igual ao int 8");
		
		// teste 17
		System.out.println("Eh" + tr3.equals(tr4) + "que (pelo equals) 8 e igual a 3");
		
		// teste 18
		System.out.println("Eh" + tr3.equals(tr2) + "que (pelo equals) 8 e igual a 5");
		
		
		// teste 19
		System.out.println(tr3 + "Sao os tracinhos que estamos testando");
		
		// teste 20
		System.out.println("Eh" + tr3.hashCode()==tr4.hashCode() + "que o hashCode de \"8\" e igual ao hashCode de \"3\"");
		
		// teste 21
		System.out.println("Eh" + tr3.hashCode()==tr2.hashCode() + "que o hashCode de \"8\" e igual ao hashCode de \"5\"");
		
		// teste 22
		Tracinhos tr3 = null;
		
		try
		{
			tr3 = new Tracinhos(tr4);
			System.out.println("Foi possivel contruir o Construtor de cópia");
		}
		catch(Exception)
		{
			System.err.println("Não foi possivel construit o Construtor de cópia");
		}
		
		// teste 23
		Tracinhos tr3 = null;
		
		try
		{
			tr3 = new Tracinhos(tr2);
			System.out.println("Foi possivel contruir o Construtor de cópia");
		}
		catch(Exception)
		{
			System.err.println("Não foi possivel construit o Construtor de cópia");
		}
		
		// teste 24
		var tr3 =(Tracinhos) tr4.clone();
        try {
            tr3.revele('A', 3);
            tr3.revele('B', 5);
        }
        catch (Exception erro)
        {}

        System.out.println(tr3);
        
        // teste 25
        var tr3 =(Tracinhos) tr2.clone();
        try {
            tr3.revele('5');
            tr3.revele('12');
        }
        catch (Exception erro)
        {}

        System.out.println(tr3);
			
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}

