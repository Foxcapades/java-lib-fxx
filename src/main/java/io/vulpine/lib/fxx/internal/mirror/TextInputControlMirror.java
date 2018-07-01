package io.vulpine.lib.fxx.internal.mirror;

import javafx.beans.property.*;
import javafx.beans.value.ObservableValue;
import javafx.scene.control.IndexRange;
import javafx.scene.control.TextFormatter;

import io.vulpine.lib.fxx.internal.trait.text.HasFont;
import io.vulpine.lib.fxx.internal.trait.text.HasText;

public interface TextInputControlMirror< T extends TextInputControlMirror >
  extends
  ControlMirror < T >,
  HasFont < T >,
  HasText < T >
{
  StringProperty promptTextProperty();

  default T promptText(String in) {
    promptTextProperty().set(in);
    return (T) this;
  }

  default T bindPromptText(ObservableValue < ? extends String > in) {
    promptTextProperty().bind(in);
    return (T) this;
  }

  default T biBindPromptText(Property < String > in) {
    promptTextProperty().bindBidirectional(in);
    return (T) this;
  }

  default T bindToPromptText(Property < String > in) {
    in.bind(promptTextProperty());
    return (T) this;
  }

  ObjectProperty < TextFormatter < ? > > textFormatterProperty();

  default T textFormatter(TextFormatter < ? > in) {
    textFormatterProperty().set(in);
    return (T) this;
  }

  default T bindTextFormatter(ObservableValue < ? extends TextFormatter < ? > > in) {
    textFormatterProperty().bind(in);
    return (T) this;
  }

  default T biBindTextFormatter(Property < TextFormatter < ? > > in) {
    textFormatterProperty().bindBidirectional(in);
    return (T) this;
  }

  default T bindToTextFormatter(Property < TextFormatter < ? > > in) {
    in.bind(textFormatterProperty());
    return (T) this;
  }

  ReadOnlyIntegerProperty lengthProperty();

  default T bindToLength(Property < Number > in) {
    in.bind(lengthProperty());
    return (T) this;
  }

  BooleanProperty editableProperty();

  default T editable(boolean in) {
    editableProperty().set(in);
    return (T) this;
  }

  default T bindEditable(ObservableValue < ? extends Boolean > in) {
    editableProperty().bind(in);
    return (T) this;
  }

  default T biBindEditable(Property < Boolean > in) {
    editableProperty().bindBidirectional(in);
    return (T) this;
  }

  default T bindToEditable(Property < Boolean > in) {
    in.bind(editableProperty());
    return (T) this;
  }

  ReadOnlyObjectProperty < IndexRange > selectionProperty();

  default T bindToSelection(Property < IndexRange > in) {
    in.bind(selectionProperty());
    return (T) this;
  }

  ReadOnlyStringProperty selectedTextProperty();

  default T bindToSelectedText(Property < String > in) {
    in.bind(selectedTextProperty());
    return (T) this;
  }

  ReadOnlyIntegerProperty anchorProperty();

  default T bindToAnchor(Property < Number > in) {
    in.bind(anchorProperty());
    return (T) this;
  }

  ReadOnlyIntegerProperty caretPositionProperty();

  default T bindToCaretPosition(Property < Number > in) {
    in.bind(caretPositionProperty());
    return (T) this;
  }

  ReadOnlyBooleanProperty undoableProperty();

  default T bindToUndoable(Property < Boolean > in) {
    in.bind(undoableProperty());
    return (T) this;
  }

  ReadOnlyBooleanProperty redoableProperty();

  default T bindToRedoable(Property < Boolean > in) {
    in.bind(redoableProperty());
    return (T) this;
  }

  void appendText(String text);

  default T append(String in) {
    appendText(in);
    return (T) this;
  }

  void insertText(int index, String text);

  default T insert(int index, String in) {
    insertText(index, in);
    return (T) this;
  }

  void deleteText(IndexRange range);
  void deleteText(int start, int end);

  default T delete(IndexRange in) {
    deleteText(in);
    return (T) this;
  }

  default T delete(int start, int end) {
    deleteText(start, end);
    return (T) this;
  }

  void replaceText(IndexRange range, String text);
  void replaceText(final int start, final int end, final String text);

  default T replace(IndexRange range, String text) {
    replaceText(range, text);
    return (T) this;
  }

  default T replace(int start, int end, String text) {
    replaceText(start, end, text);
    return (T) this;
  }
}
