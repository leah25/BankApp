package bankApp;

public interface IBaseRate {
	default double getBaseRate() {
		return 2.5;
	}
// method to return the base rate
}
