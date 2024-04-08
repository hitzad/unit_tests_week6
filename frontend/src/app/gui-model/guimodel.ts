/* tslint:disable:max-line-length */
export class GuiModel {

    private _guiModel = {
        "application": {
            "title": "Meine persönliche Anwendung",
            "formList": [
                {
                    "id": "OwnUserForm",
                    "title": "NotImplemented",
                    "formFieldList": [
                        {
                            "type": "okButton",
                            "name": "Ok"
                        }
                    ]
                },
                {
                    "id": "ModuleForm",
                    "title": "Meine Eishockey-Spiele",
                    "formFieldList": [
                        {
                            "id": "moduleName",
                            "type": "text",
                            "name": { default: "Spielort" },
                            "required": true,
                            "width": 2
                        },
                        {
                            "id": "moduleName",
                            "type": "date",
                            "name": { default: "Datum" },
                            "required": true,
                            "width": 2
                        },
                        {
                            "id": "moduleName",
                            "type": "number",
                            "name": { default: "Heim" },
                            "required": true,
                            "width": 1
                        },
                        {
                            "id": "moduleName",
                            "type": "number",
                            "name": { default: "Gast" },
                            "required": true,
                            "width": 1
                        },
                        {
                            "id": "moduleDescription",
                            "type": "text",
                            "name": { default: "Beschreibung" },
                            "newRow": true,
                            "maxLength": 4000,
                            "height": 4,
                            "width": 2
                        },
                        
                        {
                            "type": "deleteButton",
                            "name": "Delete"
                        },
                        {
                            "type": "cancelButton",
                            "name": "Cancel"
                        },
                        {
                            "type": "okButton",
                            "name": "Ok"
                        }
                    ]
                },
                {
                    "id": "ToDoForm",
                    "title": "Meine ToDo's",
                    "formFieldList": [
                        {
                            "id": "moduleName",
                            "type": "text",
                            "name": { default: "Task" },
                            "required": true,
                            "width": 2
                        },
                        {
                            "id": "moduleName",
                            "type": "date",
                            "name": { default: "Bis Wann" },
                            "required": true,
                            "width": 2
                        },
                        {
                            "id": "moduleDescription",
                            "type": "text",
                            "name": { default: "Beschreibung" },
                            "newRow": true,
                            "maxLength": 4000,
                            "height": 4,
                            "width": 2
                        },
                        
                        {
                            "type": "deleteButton",
                            "name": "Delete"
                        },
                        {
                            "type": "cancelButton",
                            "name": "Cancel"
                        },
                        {
                            "type": "okButton",
                            "name": "Ok"
                        }
                    ]
                }
            ],
            "pageList": [
                {
                    "id": "mainmenu",
                    "name": "MainMenu",
                    "elementList": [
                        {
                            "type": "pageLabel",
                            "value": "<h4>Übersicht</h4>",
                            "newRow": true
                        },
                        {
                            "type": "button",
                            "name": { default: "Eishockey" },
                            "icon": "fa-hockey-puck",
                            "color": "red",
                            "page": "modulePage",
                            "width": 2,
                            "newRow": true,
                        },
                        {
                            "type": "button",
                            "name": { default: "Todo" },
                            "icon": "fa-calendar-check-o",
                            "color": "green",
                            "page": "ToDoPage",
                            "width": 2,
                            "newRow": false,
                        },
                    ]
                },
                {
                    "id": "ToDoPage",
                    "elementList": [
                        {
                            "type": "backbutton",
                        },
                        {
                            "type": "newButton",
                            "name": { default: "Neues ToDo"},
                            "icon": "fa-user",
                            "color": "green",
                            "width": 2,
                            "form" : {
                                "form" : "ToDoForm"
                            }
                        },
                        {
                            "type": "list",
                            "name": "ToDo",
                            "icon": "fa-user",
                            "color": "wet-asphalt",
                            "search": true,
                            "url": "/todo",
                            "form": {
                                "form": "ToDoForm"
                            }
                        }
                    ]
                },
                {
                    "id": "modulePage",
                    "elementList": [
                        {
                            "type": "button",
                        },
                        {
                            "type": "newButton",
                            "name": { default: "Neues Spiel erfassen" },
                            "icon": "fa-user",
                            "color": "alizarin",
                            "width": 2,
                            "form" : {
                                "form" : "ModuleForm"
                            }
                        },
                    ]
                },
            ]
        }
    };


    get guiModel() {
        return this._guiModel;
    }
}
