package AirVoyage;
import java.util.Date;

public class Booking {
    private String bookingCode;
    private String status;
    private double baggage;
    private double cabinBaggage;
    private boolean isMealsBeverages;
    private boolean isReschedulable;
    private boolean isRefundable;
    private Flight flight;
    private Passenger passenger;

    public Booking() {
        this("001", "Booked", 20, 7, true);

    }

    public Booking(String bookingCode, String status, double baggage, double cabinBaggage, boolean isMealsBeverages) {
        this.bookingCode = bookingCode;
        this.status = status;
        this.baggage = baggage;
        this.cabinBaggage = cabinBaggage;
        this.isMealsBeverages = isMealsBeverages;
    }

    public String getBookingCode() {
        return bookingCode;
    }

    public void setBookingCode(String bookingCode) {
        this.bookingCode = bookingCode;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public double getBaggage() {
        return baggage;
    }

    public void setBaggage(double baggage) {
        this.baggage = baggage;
    }

    public double getCabinBaggage() {
        return cabinBaggage;
    }

    public void setCabinBaggage(double cabinBaggage) {
        this.cabinBaggage = cabinBaggage;
    }

    public boolean isMealsBeverages() {
        return isMealsBeverages;
    }

    public void setMealsBeverages(boolean mealsBeverages) {
        isMealsBeverages = mealsBeverages;
    }

    public boolean isRefundable() {
        return isRefundable;
    }

    public void setRefundable(boolean refundable) {
        isRefundable = refundable;
    }

    public boolean isReschedulable() {
        return isReschedulable;
    }

    public void setReschedulable(boolean reschedulable) {
        isReschedulable = reschedulable;
    }

    public Flight getFlight() {
        return flight;
    }

    public void setFlight(Flight flight) {
        this.flight = flight;
    }

    public Passenger getPassenger() {
        return passenger;
    }

    public void setPassenger(Passenger passenger) {
        this.passenger = passenger;
    }

    @Override
    public String toString() {
        return "Booking{" +
                "bookingCode='" + bookingCode + '\'' +
                ", status='" + status + '\'' +
                ", baggage=" + baggage +
                ", cabinBaggage=" + cabinBaggage +
                ", isMealsBeverages=" + isMealsBeverages +
                ", isReschedulable=" + isReschedulable +
                ", isRefundable=" + isRefundable +
                ", flight=" + flight +
                ", passenger=" + passenger +
                '}';
    }
}


