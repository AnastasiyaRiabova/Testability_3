public class CreditPaymentService {
    public double calculate(double interestRate, int amountCredit, int creditTerm) {

        double rateMonth = interestRate / 100 / 12; // процентная ставка в месяц = ( разделите размер ставки на 100 и затем на 12 )
        double coefficient = (rateMonth * (Math.pow(1 + rateMonth, creditTerm))) / ((Math.pow(1 + rateMonth, creditTerm)) - 1); // коэффициент K = (r * (1 + r) ^ n) / (((1 + r) ^ n) - 1)
        double mouthPayment = amountCredit * coefficient; // ежемесячный платеж P = общая сумма кредита * коэффициент
        return (int) mouthPayment;
    }
}




