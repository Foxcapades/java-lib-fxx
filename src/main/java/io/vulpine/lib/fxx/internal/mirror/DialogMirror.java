package io.vulpine.lib.fxx.internal.mirror;

import javafx.beans.property.*;
import javafx.beans.value.ObservableValue;
import javafx.event.EventHandler;
import javafx.event.EventTarget;
import javafx.scene.control.ButtonType;
import javafx.scene.control.DialogEvent;
import javafx.scene.control.DialogPane;
import javafx.stage.Modality;
import javafx.stage.StageStyle;
import javafx.stage.Window;
import javafx.util.Callback;

import io.vulpine.lib.fxx.internal.trait.HasGraphic;
import io.vulpine.lib.fxx.internal.trait.HasReadOnlyHeight;
import io.vulpine.lib.fxx.internal.trait.HasReadOnlyShowing;
import io.vulpine.lib.fxx.internal.trait.HasReadOnlyWidth;
import io.vulpine.lib.fxx.internal.trait.event.*;
import io.vulpine.lib.fxx.internal.trait.text.HasContentText;
import io.vulpine.lib.fxx.internal.trait.text.HasHeaderText;

public interface DialogMirror< R, T extends DialogMirror >
  extends
  EventTarget,
  HasContentText < T >,
  HasHeaderText < T >,
  HasGraphic < T >,
  HasReadOnlyWidth < T >,
  HasReadOnlyHeight < T >,
  HasOnCloseRequest < DialogEvent, T >,
  HasReadOnlyShowing < T >,
  HasOnShown < DialogEvent, T >,
  HasOnShowing < DialogEvent, T >,
  HasOnHiding < DialogEvent, T >,
  HasOnHidden < DialogEvent, T >
{
  void initModality(Modality modality);

  default T modality(Modality in) {
    initModality(in);
    return (T) this;
  }

  void initStyle(StageStyle style);

  default T style(StageStyle in) {
    initStyle(in);
    return (T) this;
  }

  void initOwner(Window window);

  default T owner(Window in) {
    initOwner(in);
    return (T) this;
  }

  ObjectProperty < DialogPane > dialogPaneProperty();

  default T dialogPane(DialogPane in) {
    dialogPaneProperty().set(in);
    return (T) this;
  }

  default T bindDialogPane(ObservableValue < ? extends DialogPane > in) {
    dialogPaneProperty().bind(in);
    return (T) this;
  }

  default T biBindDialogPane(Property < DialogPane > in) {
    dialogPaneProperty().bindBidirectional(in);
    return (T) this;
  }

  default T bindToDialogPane(Property < DialogPane > in) {
    in.bind(dialogPaneProperty());
    return (T) this;
  }

  ObjectProperty < R > resultProperty();

  default T result(R in) {
    resultProperty().set(in);
    return (T) this;
  }

  default T bindResult(ObservableValue < ? extends R > in) {
    resultProperty().bind(in);
    return (T) this;
  }

  default T biBindResult(Property < R > in) {
    resultProperty().bindBidirectional(in);
    return (T) this;
  }

  default T bindToResult(Property < R > in) {
    in.bind(resultProperty());
    return (T) this;
  }

  ObjectProperty < Callback < ButtonType, R > > resultConverterProperty();

  default T resultConverter(Callback < ButtonType, R > in) {
    resultConverterProperty().set(in);
    return (T) this;
  }

  default T bindResultConverter(ObservableValue < ? extends Callback < ButtonType, R > > in) {
    resultConverterProperty().bind(in);
    return (T) this;
  }

  default T biBindResultConverter(Property < Callback < ButtonType, R > > in) {
    resultConverterProperty().bindBidirectional(in);
    return (T) this;
  }

  default T bindToResultConverter(Property < Callback < ButtonType, R > > in) {
    in.bind(resultConverterProperty());
    return (T) this;
  }

  BooleanProperty resizableProperty();

  default T resizable(boolean in) {
    resizableProperty().set(in);
    return (T) this;
  }

  default T bindResizable(ObservableValue < ? extends Boolean > in) {
    resizableProperty().bind(in);
    return (T) this;
  }

  default T biBindResizable(Property < Boolean > in) {
    resizableProperty().bindBidirectional(in);
    return (T) this;
  }

  default T bindToResizable(Property < Boolean > in) {
    in.bind(resizableProperty());
    return (T) this;
  }

  StringProperty titleProperty();

  default T title(String in) {
    titleProperty().set(in);
    return (T) this;
  }

  default T bindTitle(ObservableValue < ? extends String > in) {
    titleProperty().bind(in);
    return (T) this;
  }

  default T biBindTitle(Property < String > in) {
    titleProperty().bindBidirectional(in);
    return (T) this;
  }

  default T bindToTitle(Property < String > in) {
    in.bind(titleProperty());
    return (T) this;
  }

  void setX(double x);

  default T x(double in) {
    setX(in);
    return (T) this;
  }

  ReadOnlyDoubleProperty xProperty();

  default T bindToX(Property < Number > in) {
    in.bind(xProperty());
    return (T) this;
  }

  void setY(double y);

  default T y(double in) {
    setY(in);
    return (T) this;
  }

  ReadOnlyDoubleProperty yProperty();

  default T bindToY(Property < Number > in) {
    in.bind(yProperty());
    return (T) this;
  }
}
