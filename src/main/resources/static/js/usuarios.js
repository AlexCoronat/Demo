// Call the dataTables jQuery plugin
$(document).ready(function() {
	cargarUsuarios();
  $('#usuarios').DataTable();
});

async function cargarUsuarios(){
	
	const request = await fetch('buscarUsuario', {
		method: 'GET',
		headers:{
			'Accept': 'application/json',
			'Content-Type': 'application/json'
		}
	});
	const usuarios = await request.json();
	
	let listHTML = '';
	for(let usr of usuarios){
		let infoUsr = '<tr>'+
						  '<td>'+usr.id+'</td>'+
						  '<td>'+usr.nombre+'</td>'+
						  '<td>'+usr.apellido+'</td>'+
						  '<td>'+usr.telefono+'</td>'+
						  '<td>'+usr.email+'</td>'+
						  '<td><a href="#" class="btn btn-danger btn-circle btn-sm"><i class="fas fa-trash"></i></a></td>'+
				      '</tr>';	
		listHTML += infoUsr;
	}
	
	document.querySelector('#usuarios tbody').outerHTML = listHTML;
}