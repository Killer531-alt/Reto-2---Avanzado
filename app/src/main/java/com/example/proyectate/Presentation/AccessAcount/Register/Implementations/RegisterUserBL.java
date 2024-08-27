package com.example.proyectate.Presentation.AccessAcount.Register.Implementations;

import android.content.Context;

import com.example.proyectate.DataAccess.Repositories.IRepository;
import com.example.proyectate.DataAccess.Repositories.RepoLogin;
import com.example.proyectate.DataAccess.Services;
import com.example.proyectate.Models.MessageResponse;
import com.example.proyectate.Models.User;
import com.example.proyectate.Presentation.AccessAcount.Register.Interfaces.IRegisterUserBL;
import com.example.proyectate.Presentation.AccessAcount.Register.Interfaces.IRegisterUserListener;

public class RegisterUserBL implements IRegisterUserBL {

    private final IRegisterUserListener listener;
    private final Context context;

    public RegisterUserBL(Context context, IRegisterUserListener registerUserListener) {
        this.listener = registerUserListener;
        this.context = context;
    }

    @Override
    public void registerUser(User user) {
        new RepoLogin().RegisterUser(context, user, new ListenerRepositories(), Services.REGISTER_USER);
    }

    private class ListenerRepositories implements IRepository {

        @Override
        public void onSuccessResponse(Object objectResponse, Services services) {
            if (services == Services.REGISTER_USER) {
                listener.responseRegisterUser((User) objectResponse);
            }
        }

        @Override
        public void onFailedResponse(MessageResponse response, Services services) {
            if (services == Services.REGISTER_USER) {
                // Handle failed response if necessary
            }
        }
    }
}
