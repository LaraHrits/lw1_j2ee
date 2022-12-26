import javax.swing.*;

public class DnDMainView extends javax.swing.JFrame {

    DnDMainController controller;

    public DnDMainView() {
        initComponents();
    }

    @SuppressWarnings("unchecked")

    private void initComponents() {

        classLabel = new javax.swing.JLabel();
        saveJSONButton = new javax.swing.JButton();
        nameLabel = new javax.swing.JLabel();
        nameTextField = new javax.swing.JTextField();
        classComboBox = new javax.swing.JComboBox<>();
        raceComboBox = new javax.swing.JComboBox<>();
        raceLabel = new javax.swing.JLabel();
        strengthTextField = new javax.swing.JTextField();
        strengthLabel = new javax.swing.JLabel();
        dexterityTextField = new javax.swing.JTextField();
        dexterityLabel = new javax.swing.JLabel();
        constitutionTextField = new javax.swing.JTextField();
        constitutionLabel = new javax.swing.JLabel();
        intellectTextField = new javax.swing.JTextField();
        intillectLabel = new javax.swing.JLabel();
        wisdomTextField = new javax.swing.JTextField();
        wisdomlabel = new javax.swing.JLabel();
        charismaTextField = new javax.swing.JTextField();
        charismaLabel = new javax.swing.JLabel();
        statsLabel = new javax.swing.JLabel();
        rollButton = new javax.swing.JButton();
        loadButton = new javax.swing.JButton();
        saveButton = new javax.swing.JButton();
        messageScrollPane = new javax.swing.JScrollPane();
        characterTextArea = new javax.swing.JTextArea();
        saveCharacterButton = new javax.swing.JButton();
        previewButton = new javax.swing.JButton();
        messageScrollPane1 = new javax.swing.JScrollPane();
        allCharactersTextArea = new javax.swing.JTextArea();
        previewAllButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        messageTextArea = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("DnD_GUI");

        classLabel.setText("Class:");

        saveJSONButton.setText("Save to JSON");
        saveJSONButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveJSONButtonActionPerformed(evt);
            }
        });

        nameLabel.setText("Name: ");

        classComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Bard", "Fighter" }));

        raceComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Gnome", "Half-Orc" }));
        raceComboBox.setSelectedItem("...");

        raceLabel.setText("Race");

        strengthTextField.setEditable(false);

        strengthLabel.setText("Strength:");

        dexterityTextField.setEditable(false);

        dexterityLabel.setText("Dexterity:");

        constitutionTextField.setEditable(false);

        constitutionLabel.setText("Constitution:");

        intellectTextField.setEditable(false);

        intillectLabel.setText("Intellect:");

        wisdomTextField.setEditable(false);

        wisdomlabel.setText("Wisdom:");

        charismaTextField.setEditable(false);

        charismaLabel.setText("Charisma:");

        statsLabel.setText("Stats");

        rollButton.setText("Roll");
        rollButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rollButtonActionPerformed(evt);
            }
        });

        loadButton.setText("Load");
        loadButton.setActionCommand("");
        loadButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loadButtonActionPerformed(evt);
            }
        });

        saveButton.setText("Save");
        saveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveButtonActionPerformed(evt);
            }
        });

        characterTextArea.setEditable(false);
        characterTextArea.setColumns(20);
        characterTextArea.setRows(5);
        messageScrollPane.setViewportView(characterTextArea);

        saveCharacterButton.setText("Save Character");
        saveCharacterButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveCharacterButtonActionPerformed(evt);
            }
        });

        previewButton.setText("Preview Character");
        previewButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                previewButtonActionPerformed(evt);
            }
        });

        allCharactersTextArea.setEditable(false);
        allCharactersTextArea.setColumns(20);
        allCharactersTextArea.setRows(5);
        messageScrollPane1.setViewportView(allCharactersTextArea);

        previewAllButton.setText("Preview All");
        previewAllButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                previewAllButtonActionPerformed(evt);
            }
        });

        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane1.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        messageTextArea.setEditable(false);
        messageTextArea.setColumns(20);
        messageTextArea.setRows(5);
        jScrollPane1.setViewportView(messageTextArea);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(raceLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(classLabel))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createSequentialGroup()
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(saveCharacterButton))
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGap(44, 44, 44)
                                            .addComponent(classComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                            .addGap(39, 39, 39)
                                            .addComponent(raceComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGap(18, 18, 18)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(messageScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(previewButton))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(44, 44, 44)
                                .addComponent(nameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(saveButton)
                        .addGap(18, 18, 18)
                        .addComponent(loadButton))
                    .addComponent(nameLabel)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(strengthLabel)
                            .addComponent(dexterityLabel)
                            .addComponent(constitutionLabel)
                            .addComponent(intillectLabel)
                            .addComponent(wisdomlabel)
                            .addComponent(charismaLabel)
                            .addComponent(statsLabel))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(wisdomTextField, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(intellectTextField, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(constitutionTextField, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(dexterityTextField, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(strengthTextField, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(rollButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(charismaTextField))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 58, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(messageScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(previewAllButton)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(146, 146, 146)
                        .addComponent(saveJSONButton))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(32, 32, 32)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(nameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(nameLabel))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(classLabel)
                                    .addComponent(classComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(raceLabel)
                                    .addComponent(raceComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(statsLabel)
                                    .addComponent(rollButton))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(strengthTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(strengthLabel))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(dexterityTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(dexterityLabel))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(constitutionTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(constitutionLabel))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(intellectTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(intillectLabel))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(wisdomTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(wisdomlabel))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(charismaTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(charismaLabel)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 92, Short.MAX_VALUE)
                                .addComponent(previewButton)
                                .addGap(18, 18, 18)
                                .addComponent(messageScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 371, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addComponent(saveCharacterButton))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(previewAllButton)
                        .addGap(18, 18, 18)
                        .addComponent(messageScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 371, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(saveJSONButton)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(loadButton)
                    .addComponent(saveButton))
                .addGap(19, 19, 19))
        );

        pack();
    }


    private void previewButtonActionPerformed(java.awt.event.ActionEvent evt) {
        controller.previewCharacter();
    }

    private void saveCharacterButtonActionPerformed(java.awt.event.ActionEvent evt) {
        controller.saveCharacter();
    }

    private void previewAllButtonActionPerformed(java.awt.event.ActionEvent evt) {
        controller.previewAllCharacters();
    }

    private void saveJSONButtonActionPerformed(java.awt.event.ActionEvent evt) {
        controller.saveJSON();
    }

    private void rollButtonActionPerformed(java.awt.event.ActionEvent evt) {
        controller.updateCharacterStats();
    }

    private void saveButtonActionPerformed(java.awt.event.ActionEvent evt) {
        controller.saveStats();
    }

    private void loadButtonActionPerformed(java.awt.event.ActionEvent evt) {
        controller.loadStats();
    }

    public void setController(DnDMainController controller){
        this.controller = controller;
    }
    
    public JTextField getNameTextField() {
        return nameTextField;
    }
    public JComboBox<String> getClassComboBox() {
        return classComboBox;
    }
    public JComboBox<String> getRaceComboBox() {
        return raceComboBox;
    }
    
    public JTextArea getMessageTextArea() {
        return messageTextArea;
    }
    public JTextArea getCharacterTextArea() {
        return characterTextArea;
    }
    public JTextArea getAllCharactersTextArea(){
        return allCharactersTextArea;
    }
    
    public JTextField getStrengthTextField() {
        return strengthTextField;
    }
    public JTextField getWisdomTextField() {
        return wisdomTextField;
    }
    public JTextField getConstitutionTextField() {
        return constitutionTextField;
    }
    public JTextField getDexterityTextField() {
        return dexterityTextField;
    }
    public JTextField getIntellectTextField() {
        return intellectTextField;
    }
    public JTextField getCharismaTextField() {
        return charismaTextField;
    }

    private javax.swing.JTextArea allCharactersTextArea;
    private javax.swing.JTextArea characterTextArea;
    private javax.swing.JLabel charismaLabel;
    private javax.swing.JTextField charismaTextField;
    private javax.swing.JComboBox<String> classComboBox;
    private javax.swing.JLabel classLabel;
    private javax.swing.JLabel constitutionLabel;
    private javax.swing.JTextField constitutionTextField;
    private javax.swing.JLabel dexterityLabel;
    private javax.swing.JTextField dexterityTextField;
    private javax.swing.JTextField intellectTextField;
    private javax.swing.JLabel intillectLabel;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton loadButton;
    private javax.swing.JScrollPane messageScrollPane;
    private javax.swing.JScrollPane messageScrollPane1;
    private javax.swing.JTextArea messageTextArea;
    private javax.swing.JLabel nameLabel;
    private javax.swing.JTextField nameTextField;
    private javax.swing.JButton previewAllButton;
    private javax.swing.JButton previewButton;
    private javax.swing.JComboBox<String> raceComboBox;
    private javax.swing.JLabel raceLabel;
    private javax.swing.JButton rollButton;
    private javax.swing.JButton saveButton;
    private javax.swing.JButton saveCharacterButton;
    private javax.swing.JButton saveJSONButton;
    private javax.swing.JLabel statsLabel;
    private javax.swing.JLabel strengthLabel;
    private javax.swing.JTextField strengthTextField;
    private javax.swing.JTextField wisdomTextField;
    private javax.swing.JLabel wisdomlabel;
}
