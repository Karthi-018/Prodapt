package org.example;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
public class Hservice {
    public static void sortHname(List<Hotel> h) {
        h.sort(new Comparator<Hotel>() {
            @Override
            public int compare(Hotel h1, Hotel h2) {
                return h1.getHname().compareTo(h2.getHname());
            }
        });
    }


    public static void sortHrating(List<Hotel> h)
    {
        h.sort(new Comparator<Hotel>()
        {
            @Override
            public int compare(Hotel h1, Hotel h2)
            {
                if(h1.getRating()> h2.getRating())
                {
                    return -1;
                }
                else if (h1.getRating()<h2.getRating())
                {
                    return 1;
                }
                else
                {
                    return 0;
                }
            }
        });

    }
}
