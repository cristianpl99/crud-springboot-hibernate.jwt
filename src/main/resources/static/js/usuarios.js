// Call the dataTables jQuery plugin
$(document).ready(function() {
cargarUsuarios();
  $('#usuarios').DataTable();
});

async function cargarUsuarios(){

      const request = await fetch('usuario/2343', {
        method: 'GET',
        headers: {
          'Accept': 'application/json',
          'Content-Type': 'application/json'
        },
      });
      const usuarios = await request.json();

      console.log(usuarios);
      }

      async function cargarUsuarios(){

            const request = await fetch('usuarios', {
              method: 'GET',
              headers: {
                'Accept': 'application/json',
                'Content-Type': 'application/json'
              },
            });
            const usuarios = await request.json();

            console.log(usuarios);
            let usuario = '<tr><td>123</td><td>Cristian Pereyra</td><td>cristianpl99@gmail.com</td><td>4444 5555</td><td><a href="#" class="btn btn-danger btn-circle"><i class="fas fa-trash"></i></a></td></tr>'

            document.querySelector('#usuarios tbody').outerHTML = usuario;

}

