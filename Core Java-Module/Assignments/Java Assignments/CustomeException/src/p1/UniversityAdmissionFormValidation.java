package p1;

class EmptyNameException extends Exception {
	public String toString() {
		return "Plzz enter your name";
	}
}

class UnderageException extends Exception {
	public String toString() {
		return "Age is below 17";
	}
}

class InvalidPercentageException extends Exception {
	public String toString() {
		return "percentage is between 0 and 100";
	}
}

class NotFitForAdmissionException extends Exception {
	public String toString() {
		return "percentage is less than 35";
	}
}

class FeesNotPaidException extends Exception {
	public String toString() {
		return "plzz pay your fees";
	}
}

class InsufficientFeesException extends Exception {
	public String toString() {
		return "plzz pay your fees atleast 30% of course fees";
	}
}

class AdmissionForm {

	String StudentName;
	int age;
	double percentage;
	double coursesFees;
	double feesPaid;

	public AdmissionForm(String StudentName, int age, double percentage,
			double coursesFees, double feesPaid) {

		this.StudentName = StudentName;
		this.age = age;
		this.percentage = percentage;
		this.coursesFees = coursesFees;
		this.feesPaid = feesPaid;
	}

	public void validateForm()
			throws EmptyNameException, UnderageException,
			InvalidPercentageException,
			NotFitForAdmissionException,
			FeesNotPaidException,
			InsufficientFeesException {

		if (this.StudentName.length() == 0) {
			throw new EmptyNameException();
		}

		if (this.age < 17) {
			throw new UnderageException();
		}

		if (this.percentage < 0 || this.percentage > 100) {
			throw new InvalidPercentageException();
		}

		if (this.percentage < 35) {
			throw new NotFitForAdmissionException();
		}

		if (this.feesPaid == 0) {
			throw new FeesNotPaidException();
		}

		if (this.feesPaid < this.coursesFees * 0.30) {
			throw new InsufficientFeesException();
		}
	}
}

public class UniversityAdmissionFormValidation {

	public static void main(String[] args) {

		AdmissionForm a1 =
				new AdmissionForm("", 15, 20, 35000, 0);

		try {
			a1.validateForm();
		}

		catch (EmptyNameException ene) {
			System.out.println(ene);
		}

		catch (UnderageException ae) {
			System.out.println(ae);
		}

		catch (InvalidPercentageException ine) {
			System.out.println(ine);
		}

		catch (NotFitForAdmissionException nne) {
			System.out.println(nne);
		}

		catch (FeesNotPaidException fne) {
			System.out.println(fne);
		}

		catch (InsufficientFeesException iie) {
			System.out.println(iie);
		}
	}
}