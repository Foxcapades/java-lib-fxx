package io.vulpine.lib.fxx.trait;

import javafx.beans.property.ObjectProperty;
import javafx.beans.property.Property;
import javafx.beans.value.ObservableValue;
import javafx.scene.AccessibleRole;

public interface HasAccessibility < T extends HasAccessibility >
{
  ObjectProperty<AccessibleRole> accessibleRoleProperty();

  default T accessibleRole(AccessibleRole in) {
    accessibleRoleProperty().set(in);
    return (T) this;
  }

  default T bindAccessibleRole(ObservableValue< ? extends AccessibleRole > in) {
    accessibleRoleProperty().bind(in);
    return (T) this;
  }

  default T biBindAccessibleRole(Property < AccessibleRole > in) {
    accessibleRoleProperty().bindBidirectional(in);
    return (T) this;
  }

  default T bindToAccessibleRole(Property< AccessibleRole > in) {
    in.bind(accessibleRoleProperty());
    return (T) this;
  }

  ObjectProperty<String> accessibleRoleDescriptionProperty();

  default T accessibleRoleDescription(String in) {
    accessibleRoleDescriptionProperty().set(in);
    return (T) this;
  }

  default T bindAccessibleRoleDescription(ObservableValue < ? extends String > in) {
    accessibleRoleDescriptionProperty().bind(in);
    return (T) this;
  }

  default T biBindAccessibleRoleDescription(Property < String > in) {
    accessibleRoleDescriptionProperty().bindBidirectional(in);
    return (T) this;
  }

  default T bindToAccessibleRoleDescription(Property < String > in) {
    in.bind(accessibleRoleDescriptionProperty());
    return (T) this;
  }

  ObjectProperty<String> accessibleTextProperty();

  default T accessibleText(String in) {
    accessibleTextProperty().set(in);
    return (T) this;
  }

  default T bindAccessibleText(ObservableValue < ? extends String > in) {
    accessibleTextProperty().bind(in);
    return (T) this;
  }

  default T biBindAccessibleText(Property < String > in) {
    accessibleTextProperty().bindBidirectional(in);
    return (T) this;
  }

  default T bindToAccessibleText(Property < String > in) {
    in.bind(accessibleTextProperty());
    return (T) this;
  }

  ObjectProperty<String> accessibleHelpProperty();

  default T accessibleHelp(String in) {
    accessibleHelpProperty().set(in);
    return (T) this;
  }

  default T bindAccessibleHelp(ObservableValue < ? extends String > in) {
    accessibleHelpProperty().bind(in);
    return (T) this;
  }

  default T biBindAccessibleHelp(Property < String > in) {
    accessibleHelpProperty().bindBidirectional(in);
    return (T) this;
  }

  default T bindToAccessibleHelp(Property < String > in) {
    in.bind(accessibleHelpProperty());
    return (T) this;
  }
}
