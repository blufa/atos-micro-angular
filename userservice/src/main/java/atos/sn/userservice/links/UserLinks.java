package atos.sn.userservice.links;
import org.springframework.stereotype.Component;

import static atos.sn.userservice.utils.Constants.APP_ROOT;
@Component
public class UserLinks {
    public static final String GET_ALL = APP_ROOT + "/users";
    public static final String GET_ONE = APP_ROOT + "/user/{id}";
    public static final String UPDATE_USER = APP_ROOT + "/user";
    public static final String DELETE_USER = APP_ROOT + "/user/{id}";
}
