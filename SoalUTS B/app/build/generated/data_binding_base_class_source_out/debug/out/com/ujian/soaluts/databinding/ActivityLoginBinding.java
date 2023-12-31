// Generated by view binder compiler. Do not edit!
package com.ujian.soaluts.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.ujian.soaluts.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityLoginBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final Button logBtn;

  @NonNull
  public final EditText logPass;

  @NonNull
  public final Button logRegis;

  @NonNull
  public final EditText logUsername;

  @NonNull
  public final TextView textView;

  private ActivityLoginBinding(@NonNull ConstraintLayout rootView, @NonNull Button logBtn,
      @NonNull EditText logPass, @NonNull Button logRegis, @NonNull EditText logUsername,
      @NonNull TextView textView) {
    this.rootView = rootView;
    this.logBtn = logBtn;
    this.logPass = logPass;
    this.logRegis = logRegis;
    this.logUsername = logUsername;
    this.textView = textView;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityLoginBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityLoginBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_login, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityLoginBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.logBtn;
      Button logBtn = ViewBindings.findChildViewById(rootView, id);
      if (logBtn == null) {
        break missingId;
      }

      id = R.id.logPass;
      EditText logPass = ViewBindings.findChildViewById(rootView, id);
      if (logPass == null) {
        break missingId;
      }

      id = R.id.logRegis;
      Button logRegis = ViewBindings.findChildViewById(rootView, id);
      if (logRegis == null) {
        break missingId;
      }

      id = R.id.logUsername;
      EditText logUsername = ViewBindings.findChildViewById(rootView, id);
      if (logUsername == null) {
        break missingId;
      }

      id = R.id.textView;
      TextView textView = ViewBindings.findChildViewById(rootView, id);
      if (textView == null) {
        break missingId;
      }

      return new ActivityLoginBinding((ConstraintLayout) rootView, logBtn, logPass, logRegis,
          logUsername, textView);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
