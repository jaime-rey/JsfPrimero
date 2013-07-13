/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.monokepos.validators;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.component.html.HtmlInputText;
import javax.faces.context.FacesContext;
import javax.faces.validator.FacesValidator;
import javax.faces.validator.Validator;
import javax.faces.validator.ValidatorException;

/**
 *
 * @author jaime
 */
@FacesValidator("edadValidator")
public class EdadValidator implements Validator {

    @Override
    public void validate(FacesContext facesContext, UIComponent uIcomponent,
            Object value) throws ValidatorException {

        if ((int) value < 18 || (int) value > 99) {
            FacesMessage facesMessage =
                    new FacesMessage(value + ": No es una edad valida.");
            throw new ValidatorException(facesMessage);
        }
    }
}
