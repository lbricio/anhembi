public class Main {
    public static void main(String[] args) {
		try {
			for (String cpf : args) {
				cpf = cpf.replaceAll("[.-]", "");
				
				if (cpf.length() != 9) {
					throw new cpfError("erro, usar somente os 9 primeiros dígitos");
				}
				if (cpf.matches("\\d+") == false) {
					throw new cpfError("erro, o CPF deve ser composto apenas por dígitos");
				}
				System.out.println(getDigito(cpf));
			}
		}
		catch (cpfError e) {
			System.out.println(e.getMessage());
		}
		return;
	}

	private static String getDigito(String cpf) {
		int sum;
		String digito = "";

		// cálculo primeiro digito
		sum = 0;
		for (int j=0; j<9; j++)
			sum += (j + 1) * Character.getNumericValue(cpf.charAt(j));
		digito += (sum % 11 > 2) ? sum % 11 : 0;

		// cálculo segundo digito
		sum = 0;
		for (int j=0; j<9; j++)
			sum += j * Character.getNumericValue(cpf.charAt(j));
		sum += Integer.parseInt(digito) * 9;
		digito += (sum % 11 > 2) ? sum % 11 : 0;

		return digito;
	}
}

class cpfError extends Exception {
    public cpfError(String msg) {
        super(msg);
    }
}


