public class Constants {
    enum ORDER_DETAILS_STATUS{
        None("None"),
        Allocated("Allocated"),
        Invoiced("Invoiced"),
        Shipped("Shipped"),
        On_Order("On Order"),
        No_Stock("No Stock");
        private final String displayName;
        ORDER_DETAILS_STATUS(final String display)
        {
            this.displayName = display;
        }
        @Override public String toString()
        {
            return this.displayName;
        }
    };
    enum CITIES{
        Las_Vegas("Las Vegas"),
        New_York("New York"),
        Portland("Portland"),
        Denver("Denver"),
        Los_Angelas("Los Angelas"),
        Milwaukee("Milwaukee"),
        Memphis("Memphis"),
        Chicago("Chicago"),
        Boise("Boise"),
        Miami("Miami"),
        Seattle("Seattle"),
        Salt_Lake_City("Salt Lake City");
        private final String displayName;
        CITIES(final String display)
        {
            this.displayName = display;
        }
        @Override public String toString()
        {
            return this.displayName;
        }

    }
}
