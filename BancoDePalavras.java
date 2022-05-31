public class BancoDePalavras
{
    private static String[] palavras = 
    {
		"AGUA",
		"GARFO",
		"VIDEO",
		"SABADO",
		"DALMATA",
		"GARRAFA",
		"CASEMIRO",
		"MALIGNO",
		"MALIGNO JR",
		"CACHORRO",
		"GUILHERME",
		"LUZ",
		"NEYMAR",
		"RAISSA",
		"ADRIANA",
		"GOKU",
		"NARUTO",
		"ROCKET LEAGUE",
		"PALMEIRAS NAO TEM MUNDIAL",
		"GABARITO",
		"ACARAJE",
		"PLAYSTATION",
		"XBOX",
		"GEANY",
		"INTELLIJ",
		"SONIC",
		"MARIO",
		"FONE",
		"CABELO",
		"ESTOJO",
		"BANHO",
		"PERNA",
		"BRAÇO",
		"UBER",
		"DRAGAO",
		"CAPIVARA"
    };

    public static Palavra getPalavraSorteada ()
    {
        Palavra palavra = null;

        try
        {
            palavra =
            new Palavra (BancoDePalavras.palavras[
            (int)(Math.random() * BancoDePalavras.palavras.length)]);
        }
        catch (Exception e)
        {}

        return palavra;
    }
}
