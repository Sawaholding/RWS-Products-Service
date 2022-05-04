package RWS.products.repository;

import RWS.products.models.ProCategory;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


@Service
public class DB_Repository {

    List<ProCategory> categories = new ArrayList<ProCategory>
        (
                Arrays.asList(
            new ProCategory("Sandwiches",
                  "https://images.unsplash.com/photo-1554433607-66b5efe9d304?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxzZWFyY2h8Nnx8c2FuZHdpY2h8ZW58MHx8MHx8&w=1000&q=80",
                  "02823898-5216-4173-98fd-1f10ad1c5928",
                  "2022-03-08T15:29:10.859"),
            new ProCategory("Sandwiches",
                "https://images.unsplash.com/photo-1554433607-66b5efe9d304?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxzZWFyY2h8Nnx8c2FuZHdpY2h8ZW58MHx8MHx8&w=1000&q=80",
                "02823898-5216-4173-98fd-1f10ad1c5928",
                "2022-03-08T15:29:10.859"),
            new ProCategory("Sandwiches",
                    "https://images.unsplash.com/photo-1554433607-66b5efe9d304?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxzZWFyY2h8Nnx8c2FuZHdpY2h8ZW58MHx8MHx8&w=1000&q=80",
                    "02823898-5216-4173-98fd-1f10ad1c5928",
                    "2022-03-08T15:29:10.859"),
            new ProCategory("Sandwiches",
                    "https://images.unsplash.com/photo-1554433607-66b5efe9d304?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxzZWFyY2h8Nnx8c2FuZHdpY2h8ZW58MHx8MHx8&w=1000&q=80",
                    "02823898-5216-4173-98fd-1f10ad1c5928",
                    "2022-03-08T15:29:10.859"),
            new ProCategory("Sandwiches",
                    "https://images.unsplash.com/photo-1554433607-66b5efe9d304?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxzZWFyY2h8Nnx8c2FuZHdpY2h8ZW58MHx8MHx8&w=1000&q=80",
                    "02823898-5216-4173-98fd-1f10ad1c5928",
                    "2022-03-08T15:29:10.859"),
            new ProCategory("Sandwiches",
                    "https://images.unsplash.com/photo-1554433607-66b5efe9d304?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxzZWFyY2h8Nnx8c2FuZHdpY2h8ZW58MHx8MHx8&w=1000&q=80",
                    "02823898-5216-4173-98fd-1f10ad1c5928",
                    "2022-03-08T15:29:10.859"),
            new ProCategory("Sandwiches",
                "https://images.unsplash.com/photo-1554433607-66b5efe9d304?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxzZWFyY2h8Nnx8c2FuZHdpY2h8ZW58MHx8MHx8&w=1000&q=80",
                "02823898-5216-4173-98fd-1f10ad1c5928",
                "2022-03-08T15:29:10.859")
                )
        );


    public List<ProCategory> getCategories() {
        return categories;
    }

}
