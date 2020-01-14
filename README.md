# SoftwareDesignPatterns
1. What To Do
  This homework requires the student to design a simple application implemented in Java by applying the following
  patterns:
  1. Controller
  2. Expert
  3. Iterator
  4. Composite
  5. Command
  6. State
  When the application starts, it displays a window containing ve buttons and a drawing area. The buttons
  are labeled \Line," \Box," \Circle," \Undo" and \Redo," respectively. When any of the rst three buttons is
  clicked, and then the mouse is pressed in the drawing area, the corresponding shape is drawn in the drawing
  area at the location clicked. When the Undo or Redo button is clicked, the last shape is removed or redrawn.

2.What to Produce and Submit
The student is required to produce and submit the following:
  1. Produce and submit a domain model class diagram (DMCD) for the simple application. The DMCD may
  contain only a few classes but this is ne for this homework.
  2. Produce and submit a design sequence diagram for the simple use case of the application. The design
  sequence diagram must apply the patterns listed above. It must also clearly separate the presentation
  (i.e., the graphical user interface) and the business objects. That is, all business-object related processing
  must take place in the business-object layer, not the presentation layer. Use UML stereotype or UML
  note to indicate the patterns applied.
  3. Produce and submit a design class diagram for the simple application. Use UML stereotype or UML note
  to indicate the patterns applied.
  4. Implement the design in Java. You may use Swing or AWT, whichever you prefer. Provide comments in
  your code to show the patterns you apply.
  5. Compile and run your application. Add two circles, two boxes, and three lines, each of these must overlap
  with one other shape (which can be the same kind of shape such as a circle overlaps with another circle).
  Produce and submit several screen shots to show the shapes, as well as illustrate the working of the Undo
  and Redo buttons.
