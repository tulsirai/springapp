


<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <!-- jQuery, jQuery.ui -->
        <link href="https://code.jquery.com/ui/1.11.4/themes/smoothness/jquery-ui.min.css" rel="stylesheet" type="text/css" />
        <script src="https://code.jquery.com/jquery.min.js"></script>
        <script src="https://code.jquery.com/ui/1.11.4/jquery-ui.min.js"></script>

        <!-- Bootstrap -->
        <link href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/css/bootstrap.min.css" rel="stylesheet" type="text/css" />
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/js/bootstrap.min.js"></script>

        <!-- React -->
        <script src="https://cdnjs.cloudflare.com/ajax/libs/react/0.14.7/react.js"></script>        
        <script src="https://cdnjs.cloudflare.com/ajax/libs/react/0.14.7/react-dom.js"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/babel-core/5.8.23/browser.min.js"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/marked/0.3.2/marked.min.js"></script>
        
        <!-- Meta Data -->
        <meta name="viewport" content="minimum-scale=1.0, width=device-width, maximum-scale=1.0, user-scalable=no" />
        <meta charset="utf-8">
        <meta name="description" content="React Bulletin Board with Notes">
        <title>JSP Page</title>
    </head>
    
    <body>
        <div id="content"></div>
        <script type="text/babel" src="jsx/helloworld.js">
          
        </script>
        <form action="rest/hello/info" method="POST">
            <p>
                First Name: <input type="text" name="fname"/>
            </p>
            <p>
                Last Name: <input type="text" name="lname"/>
            </p>
            <input type="submit" value="Submit" /> 
        </form>
    </body>
</html>