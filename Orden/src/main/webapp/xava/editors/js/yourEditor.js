/*
https://www.openxava.org/OpenXavaDoc/docs/customizing_en.html
*/

openxava.addEditorInitFunction(function() {
    $(".your-editor").click(function() {
        alert("Hello");
    });
});