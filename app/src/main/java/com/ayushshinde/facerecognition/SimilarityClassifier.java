package com.ayushshinde.facerecognition;

/**
 * The SimilarityClassifier interface represents a classifier used for face recognition.
 */
public interface SimilarityClassifier {

  /**
   * An immutable result returned by a Classifier describing what was recognized.
   */
  class Recognition {
    /**
     * A unique identifier for what has been recognized. Specific to the class, not the instance of the object.
     */
    private final String id;

    /**
     * Display name for the recognition.
     */
    private final String title;

    /**
     * The distance or similarity score associated with the recognition result.
     */
    private final Float distance;

    /**
     * Additional extra information associated with the recognition result.
     */
    private Object extra;

    /**
     * Constructs a Recognition object.
     *
     * @param id       The unique identifier for the recognition.
     * @param title    The display name for the recognition.
     * @param distance The distance or similarity score associated with the recognition.
     */
    public Recognition(final String id, final String title, final Float distance) {
      this.id = id;
      this.title = title;
      this.distance = distance;
      this.extra = null;
    }

    /**
     * Sets additional extra information associated with the recognition result.
     *
     * @param extra The extra information to be set.
     */
    public void setExtra(Object extra) {
      this.extra = extra;
    }

    /**
     * Retrieves the additional extra information associated with the recognition result.
     *
     * @return The extra information associated with the recognition result.
     */
    public Object getExtra() {
      return this.extra;
    }

    /**
     * Returns a string representation of the Recognition object.
     *
     * @return The string representation of the Recognition object.
     */
    @Override
    public String toString() {
      String resultString = "";
      if (id != null) {
        resultString += "[" + id + "] ";
      }

      if (title != null) {
        resultString += title + " ";
      }

      if (distance != null) {
        resultString += String.format("(%.1f%%) ", distance * 100.0f);
      }

      return resultString.trim();
    }

  }
}

